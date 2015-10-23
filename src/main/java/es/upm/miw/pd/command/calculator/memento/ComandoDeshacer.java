package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;

public class ComandoDeshacer extends Comando {

    private GestorMementos<MementoCalculadora> gestorMementos;

    private Calculator calculator;

    public ComandoDeshacer(Originador cal, GestorMementos<MementoCalculadora> gestorMementos) {
        this.calculator = cal;
        this.gestorMementos = gestorMementos;

    }

    public String name() {
        return "Restaurar";
    }

    public void execute() {
        String clave = (String) IO.getIO().select(gestorMementos.keys());
        ((Originador) calculator).restoreMemento(gestorMementos.getMemento(clave));
        IO.getIO().println("Restaurando estado del sistema");
    }

}
