package Task8;


public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        SessionManager sessionManager = new SessionManager();

        editor.openFile("file1.txt");
        editor.setWindowPosition("window1", "top-left");
        sessionManager.save(editor);

        editor.openFile("file2.txt");
        editor.setWindowPosition("window2", "bottom-right");
        sessionManager.save(editor);

        editor.showState();

        System.out.println("Restoring previous state...");
        sessionManager.undo(editor);
        editor.showState();

        System.out.println("Restoring initial state...");
        sessionManager.undo(editor);
        editor.showState();
    }
}
