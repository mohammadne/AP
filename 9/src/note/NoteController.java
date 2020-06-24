package note;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import models.Note;
import util.Alert;
import util.Prefrence;


import java.net.URL;
import java.util.*;

public class NoteController implements Initializable {
    @FXML
    private ListView<Note> listView;
    @FXML
    private TextArea textArea;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        HashMap<String, Note> notes = Prefrence.reader();
        for (Map.Entry<String, Note> note : notes.entrySet())
            NoteState.notes.add(note.getValue());

        listView.setItems(NoteState.notes);
    }

    @FXML
    private void addNewNote(MouseEvent mouseEvent) {
        Alert.show();
    }

    @FXML
    private void saveNote(MouseEvent mouseEvent) {
        HashMap<String, Note> notesMap = new HashMap<>();
        List<Note> notesList = new ArrayList<>(NoteState.notes);
        for (Note note : notesList) {
            notesMap.put(note.getTitle(), note);
        }
        Prefrence.writer(notesMap);
    }
}
