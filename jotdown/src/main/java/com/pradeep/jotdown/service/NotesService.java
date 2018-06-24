package com.pradeep.jotdown.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradeep.jotdown.domain.Notes;
import com.pradeep.jotdown.exceptions.NotesEmptyException;
import com.pradeep.jotdown.exceptions.NotesNotSavedException;
import com.pradeep.jotdown.repositories.NotesRepository;

@Service
public class NotesService {

	@Autowired
	private NotesRepository notesRepository;
	
	public Notes saveNotes(Notes notes) {
		if(notes.getTopic()==null||notes.getSubTopic()==null||notes.getDescription()==null) {
			throw new NotesEmptyException("Notes was empty!");
		}
		
		Notes savedNotes = notesRepository.save(notes);
		if(savedNotes==null) {
			throw new NotesNotSavedException("Notes could not be saved!");
		}
		return savedNotes;
	}
}
