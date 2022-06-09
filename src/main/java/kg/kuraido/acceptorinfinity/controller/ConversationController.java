package kg.kuraido.acceptorinfinity.controller;


import kg.kuraido.acceptorinfinity.model.Conversation;
import kg.kuraido.acceptorinfinity.repository.ConversationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConversationController {
    private final ConversationRepo conversationRepo;

    public ConversationController(ConversationRepo conversationRepo) {
        this.conversationRepo = conversationRepo;
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


}
