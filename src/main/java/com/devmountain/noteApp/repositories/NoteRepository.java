package com.devmountain.noteApp.repositories;

import com.devmountain.noteApp.entites.Note;
import com.devmountain.noteApp.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

    public List<Note> findAllByUserEquals(User user);
}
