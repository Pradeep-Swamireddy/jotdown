package com.pradeep.jotdown.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pradeep.jotdown.domain.Notes;

public interface NotesRepository extends CrudRepository<Notes, Long>{

}
