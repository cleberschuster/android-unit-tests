package br.com.schuster.androidunittests.note_list.domain.use_case

import br.com.schuster.androidunittests.core.domain.model.NoteItem
import br.com.schuster.androidunittests.core.domain.repository.NoteRepository


class DeleteNote(
    private val noteRepository: NoteRepository
) {

    suspend operator fun invoke(note: NoteItem) {
        noteRepository.deleteNote(note)
    }

}
















