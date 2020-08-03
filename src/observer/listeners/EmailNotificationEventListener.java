package observer.listeners;

import java.io.File;

/**
 * Конкретный подписчик
 */
public class EmailNotificationEventListener implements EventListener {
    private String email;

    public EmailNotificationEventListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + " Someone has performed " + eventType
        + " operation with the following file: " + file.getName());
    }
}
