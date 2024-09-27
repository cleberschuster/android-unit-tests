package br.com.schuster.androidunittests.core.data.repository

import br.com.schuster.androidunittests.core.data.local.NoteDb
import br.com.schuster.androidunittests.core.data.mapper.toNoteEntityForDelete
import br.com.schuster.androidunittests.core.data.mapper.toNoteEntityForInsert
import br.com.schuster.androidunittests.core.data.mapper.toNoteItem
import br.com.schuster.androidunittests.core.domain.model.NoteItem
import br.com.schuster.androidunittests.core.domain.repository.NoteRepository


class NoteRepositoryImpl(
    noteDb: NoteDb
) : NoteRepository {

    private val noteDao = noteDb.noteDao

    override suspend fun upsertNote(noteItem: NoteItem) {
        noteDao.upsertNoteEntity(noteItem.toNoteEntityForInsert())
    }

    override suspend fun deleteNote(noteItem: NoteItem) {
        noteDao.deleteNoteEntity(noteItem.toNoteEntityForDelete())
    }

    override suspend fun getAllNotes(): List<NoteItem> {
        return noteDao.getAllNoteEntities().map { it.toNoteItem() }
    }
}












