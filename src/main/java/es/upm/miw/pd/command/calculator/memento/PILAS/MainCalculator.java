package es.upm.miw.pd.command.calculator.memento.PILAS;

import upm.jbb.IO;

public class MainCalculator {
    private CommandManager commandManager;

    public MainCalculator() {
        Calculator calculator = new Calculator();
        Stack<Calculator> pilaEstados = new Stack<Calculator>();
        GestorEstados gestorEstados = new GestorEstados(pilaEstados);
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new ComandoGuardar(calculator,gestorEstados));
        this.commandManager.add(new ComandoDeshacer(calculator,gestorEstados));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculator());
    }
}
