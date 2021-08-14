package com.saramrobot.swdev.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.saramrobot.swdev.model.NoteVO;
import com.saramrobot.swdev.service.NoteService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private NoteService noteService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		model.addAttribute("noteList", noteService.getNoteList());

		return "notelist";
	}
	
	@RequestMapping(value = "/notes", method = RequestMethod.POST)
	public String newnote(@ModelAttribute("NoteVO") NoteVO noteVO, RedirectAttributes rttr) throws Exception {
		noteService.insertNote(noteVO);
		return "redirect:/";
	}
}
