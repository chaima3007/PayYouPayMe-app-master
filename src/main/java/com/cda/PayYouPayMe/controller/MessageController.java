package com.cda.PayYouPayMe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cda.PayYouPayMe.service.MessageService;
import com.cda.PayYouPayMe.service.UtilisateurService;

@Controller
@RequestMapping("/message")
public class MessageController {

	private final MessageService messageService;
	private final UtilisateurService utilisateurService;
	

	public MessageController(MessageService messageService,UtilisateurService utilisateurService) {
		this.messageService = messageService;
		this.utilisateurService = utilisateurService;
	}

	
	@GetMapping("/")
	public String message(Model model) {
		model.addAttribute("messages", messageService.getMessageFromCurrentUser());
		model.addAttribute("role",utilisateurService.getCurrentUser().getRole());
		return "message";
	}
	
	///message/addmessage}
	@PostMapping("/addmessage")
	public String addMessage(Model model, @RequestParam String messagecontent) {
		messageService.addMessage(messagecontent);
		model.addAttribute("role",utilisateurService.getCurrentUser().getRole());
		
		
		model.addAttribute("messages", messageService.getMessageFromCurrentUser());
		return "message";
	}
}
