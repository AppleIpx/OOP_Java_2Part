package Task8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Editor {
    private List<String> openFiles = new ArrayList<>();
    private Map<String, String> windowPositions = new HashMap<>();

    public void openFile(String file) {
        openFiles.add(file);
    }

    public void setWindowPosition(String window, String position) {
        windowPositions.put(window, position);
    }

    public EditorMemento save() {
        return new EditorMemento(openFiles, windowPositions);
    }

    public void restore(EditorMemento memento) {
        openFiles = new ArrayList<>(memento.getOpenFiles());
        windowPositions = new HashMap<>(memento.getWindowPositions());
    }

    public void showState() {
        System.out.println("Open files: " + openFiles);
        System.out.println("Window positions: " + windowPositions);
    }
}

