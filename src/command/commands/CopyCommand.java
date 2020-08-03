package command.commands;

import command.editor.Editor;

/**
 * Конкретная команды
 */
public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);
    }

    /**
     * Команда копирования не записывается в историю, так как
     * она меняет состояние объектаа
     */
    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
