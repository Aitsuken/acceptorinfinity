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


    @GetMapping({"/getAllConversations", "/conversation"})
    public ModelAndView getAllConversations(){
        ModelAndView mav = new ModelAndView("conversation");
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
        return "redirect:/conversation";
    }
    @GetMapping("/addCategory")
    public ModelAndView addCategory(){
        ModelAndView mav = new ModelAndView("add-category-form");
        Category newCategory = new Category();
        mav.addObject("category", newCategory);
        return mav;
    }
    @PostMapping("/saveCategory")
    public String saveCategory(@ModelAttribute Category category){
        categoryRepo.save(category);
        return "redirect:/conversaton";
    }

    //show and select categories in dropdown when adding
    @ModelAttribute("categories")
    public List<Category> getCategories(){
        return categoryRepo.findAll();
    }


}
