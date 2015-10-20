package es.upm.miw.pd.command.calculator.memento;

public abstract class Comando extends GestorEstados {

    public Comando() {
        super();
    }

    public void execute() {
        return;
    }

    public String name() {
        return "";
    }

}
