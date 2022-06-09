package kg.kuraido.acceptorinfinity.controller;

import kg.kuraido.acceptorinfinity.dto.AccountDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class AuthController {
    @GetMapping("user/signup")
    public String showSignUpForm(WebRequest webRequest, Model model){
        AccountDto accountDto = new AccountDto();
        model.addAttribute("account", accountDto);
        return "signup";
    }
}
