package com.example.easynotes.repository;

import com.example.easynotes.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * 
 */

@CrossOrigin("http://localhost:4200")
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
	
}
