package factory_method.factory;

import factory_method.buttons.Button;

// Базовый класс фабрики
public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Подклассы будут переопределять этот метод, чтобы создавать конкретные
     * объекты продуктов, разные для каждой фарбики
     */
    public abstract Button createButton();
}
