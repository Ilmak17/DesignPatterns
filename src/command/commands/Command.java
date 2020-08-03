package command.commands;

import command.editor.Editor;

/**
 * Абстракная команда задает обший интерфейс для конкретных
 * классов команд и содержит базовое поведение отмены операций
 */
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    // Сохраняем состояние редактора
    void backup() {
        backup = editor.textField.getText();
    }

    // Восстанавливаем состояние редактора
    public void undo() {
        editor.textField.setText(backup);
    }

    // Главный метод команды остается абстракным, чтобы каждая
    // конкретная команда определила его по-своему. Метод должен
    // возвращать true или false в зависимтости от того, изменила
    // ли команда состояние редактора, а значит, нужно ли ее
    // сохранить в истории
    public abstract boolean execute();
}
