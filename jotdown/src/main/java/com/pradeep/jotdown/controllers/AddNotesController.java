package com.pradeep.jotdown.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pradeep.jotdown.domain.Notes;
import com.pradeep.jotdown.exceptions.ErrorMessage;
import com.pradeep.jotdown.exceptions.NotesEmptyException;
import com.pradeep.jotdown.service.NotesService;

@Controller
@RequestMapping("/addnotes")
public class AddNotesController {
	@Autowired
	private NotesService notesService;
	
	@GetMapping
	public String addNotesForm(Model model) {
		model.addAttribute("notes",new Notes());
		return "addnotes";
	}
	
	@PostMapping(produces= "application/json",consumes= "application/json")
	public @ResponseBody Notes saveNotes(@RequestBody Notes notes) { //@ModelAttribute{
		return notesService.saveNotes(notes);
	}
	
	@ExceptionHandler(NotesEmptyException.class)
	public ResponseEntity<ErrorMessage> notesExceptionHandler(NotesEmptyException e){
		ErrorMessage message = new ErrorMessage();
		message.setErrorNo(HttpStatus.BAD_REQUEST);
		message.setErrorMessage(e.getMessage());
		ResponseEntity<ErrorMessage> resp = new ResponseEntity<>(message,message.getErrorNo());
		return resp;
	}
}
