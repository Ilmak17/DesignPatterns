package observer;

import observer.editor.Editor;
import observer.listeners.EmailNotificationEventListener;
import observer.listeners.LogOpenEventListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenEventListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationEventListener("admin@gmail.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
