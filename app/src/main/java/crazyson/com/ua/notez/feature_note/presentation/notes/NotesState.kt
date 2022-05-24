package crazyson.com.ua.notez.feature_note.presentation.notes

import crazyson.com.ua.notez.feature_note.domain.model.Note
import crazyson.com.ua.notez.feature_note.domain.util.NoteOrder
import crazyson.com.ua.notez.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false,

)
