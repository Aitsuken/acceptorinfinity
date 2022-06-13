package kg.kuraido.acceptorinfinity.controller;


import kg.kuraido.acceptorinfinity.model.Category;
import kg.kuraido.acceptorinfinity.model.Conversation;
import kg.kuraido.acceptorinfinity.repository.CategoryRepo;
import kg.kuraido.acceptorinfinity.repository.ConversationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ConversationController {
    private final ConversationRepo conversationRepo;
    private final CategoryRepo categoryRepo;
    public ConversationController(ConversationRepo conversationRepo, CategoryRepo categoryRepo) {
        this.conversationRepo = conversationRepo;
        this.categoryRepo = categoryRepo;
    }


    @GetMapping({"/getAllConversations", "/show"})
    public ModelAndView getAllConversations(){
        ModelAndView mav = new ModelAndView("show");
        mav.addObject("conversations", conversationRepo.findAll());
        return mav;
    }
    @GetMapping("/addConversation")
    public ModelAndView addConversation(){
        ModelAndView mav = new ModelAndView("add-conversation-form");
        Conversation newConversation = new Conversation();
        mav.addObject("conversation", newConversation);
        return mav;
    }

    @PostMapping("/saveConversation")
    public String saveConversation(@ModelAttribute Conversation conversation){
        conversationRepo.save(conversation);
        return "redirect:/show";
    }

    @ModelAttribute("categories")
    public List<Category> getCategories(){
        return categoryRepo.findAll();
    }


}
