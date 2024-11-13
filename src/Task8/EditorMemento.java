package Task8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class EditorMemento {
    private final List<String> openFiles;
    private final Map<String, String> windowPositions;

    public EditorMemento(List<String> openFiles, Map<String, String> windowPositions) {
        this.openFiles = new ArrayList<>(openFiles);
        this.windowPositions = new HashMap<>(windowPositions);
    }

    public List<String> getOpenFiles() {
        return openFiles;
    }

    public Map<String, String> getWindowPositions() {
        return windowPositions;
    }
}
