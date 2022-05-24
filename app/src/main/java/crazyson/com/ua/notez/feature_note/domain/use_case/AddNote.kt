package crazyson.com.ua.notez.feature_note.domain.use_case

import crazyson.com.ua.notez.feature_note.domain.model.InvalidNoteException
import crazyson.com.ua.notez.feature_note.domain.model.Note
import crazyson.com.ua.notez.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException(message = "Title of the cannot be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("Note cannot be empty.")
        }
        repository.insertNote(note)
    }
}