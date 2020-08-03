package command.commands;

import command.editor.Editor;

/**
 * Конкретная команды
 */
public class CutCommand extends Command {
    public CutCommand(Editor editor) {
        super(editor);
    }

    /**
     * Команда, меняющая состояние редактора, сохраняет
     * состояние редактора перед своим действием и сигнализирует
     * об изменении, возвращаю true
     */
    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText().isEmpty()) return false;

        backup();
        String source = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}
