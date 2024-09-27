package br.com.schuster.androidunittests.note_list.domain.use_case

import br.com.schuster.androidunittests.core.domain.model.NoteItem
import br.com.schuster.androidunittests.core.domain.repository.NoteRepository


class GetAllNotes(
    private val noteRepository: NoteRepository
) {

    suspend operator fun invoke(
        isOrderByTitle: Boolean
    ): List<NoteItem> {
        return if (isOrderByTitle) {
            noteRepository.getAllNotes().sortedBy { it.title.lowercase() }
        } else {
            noteRepository.getAllNotes().sortedBy { it.dateAdded }
        }
    }

}



















