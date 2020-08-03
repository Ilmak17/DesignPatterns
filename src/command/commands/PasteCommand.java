package command.commands;

import command.editor.Editor;

/**
 * Конкретная команды
 */
public class PasteCommand extends Command {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    /**
     * Команда, меняющая состояние редактора, сохраняет
     * состояние редактора перед своим действием и сигнализирует
     * об изменении, возвращаю true
     */
    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
