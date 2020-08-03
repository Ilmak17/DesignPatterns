package factory_method;

import factory_method.factory.Dialog;
import factory_method.factory.HtmlDialog;
import factory_method.factory.WindowsDialog;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * Приложение создает определенную фабрику в зависимости от конфигурации или
     * окружения
     */
    public static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * Весь остальной клиентский код работает с фабрикой и продуктами только
     * через обший интерфейс, поэтому для него неважно какая фабрика была
     * создана
     */
    public static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
