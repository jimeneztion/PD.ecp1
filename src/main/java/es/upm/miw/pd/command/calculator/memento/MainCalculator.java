package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;

public class MainCalculator {
    private CommandManager commandManager;

    public MainCalculator() {
        Originador calculator = new Originador();
        GestorMementos<MementoCalculadora> gestorMementos = new GestorMementos<>();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new ComandoGuardar(calculator, gestorMementos));
        this.commandManager.add(new ComandoDeshacer(calculator, gestorMementos));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculator());
    }
}
