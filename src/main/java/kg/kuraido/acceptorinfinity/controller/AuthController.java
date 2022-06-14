package kg.kuraido.acceptorinfinity.controller;

import kg.kuraido.acceptorinfinity.dto.AccountDto;
import kg.kuraido.acceptorinfinity.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("/user/signup")
public class AuthController {
    private AccountService accountService;

    public AuthController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public String showSignUpForm(WebRequest webRequest, Model model){

        AccountDto accountDto = new AccountDto();
        model.addAttribute("user", accountDto);
        return "signup";
    }


    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") AccountDto accountDto){
        accountService.save(accountDto);
        return "redirect:/signup?success";
    }
}
