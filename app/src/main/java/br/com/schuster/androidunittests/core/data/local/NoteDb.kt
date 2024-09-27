package br.com.schuster.androidunittests.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [NoteEntity::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDb: RoomDatabase() {
    abstract val noteDao: NoteDao
}