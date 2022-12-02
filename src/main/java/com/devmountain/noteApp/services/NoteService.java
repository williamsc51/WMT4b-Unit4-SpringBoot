package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.NoteDto;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface NoteService {
    @Transactional
    void addNote(NoteDto noteDto, Long userId);

    @Transactional
    void deleteNoteById(Long id);

    @Transactional
    void updateNoteById(NoteDto noteDto);

    @Transactional
    List<NoteDto> getAllNoteByUserId(Long userId);

    Optional<NoteDto> getNoteById(Long noteId);
}
