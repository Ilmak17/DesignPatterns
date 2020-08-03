package singleton.non_thread_safe;

/**
 * Класс одиночки определяет статический метод 'getInstance'
 */
public class Singleton {
    // Статическое поле для хранения объекта-одиночки
    private static Singleton instance;
    public String value;

    // Приватный конструктор одиночки
    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    // Основной статический метод одиночки служит альтарнативой конструктору
    // и является точкой доступа к экземпляру этого класса
    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
