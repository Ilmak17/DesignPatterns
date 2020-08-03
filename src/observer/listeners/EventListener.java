package observer.listeners;

import java.io.File;


/**
 * Общий интерфейс подписчиков
 */
public interface EventListener {
    void update(String eventType, File file);
}