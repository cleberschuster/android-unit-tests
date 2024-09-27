package br.com.schuster.androidunittests.core.domain.repository

import br.com.schuster.androidunittests.core.domain.model.NoteItem


interface NoteRepository {

    suspend fun upsertNote(noteItem: NoteItem)

    suspend fun deleteNote(noteItem: NoteItem)

    suspend fun getAllNotes(): List<NoteItem>

}


















