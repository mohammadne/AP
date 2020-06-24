package note;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import models.Note;

public abstract class NoteState {
    public static ObservableList<Note> notes = FXCollections.observableArrayList();
}
