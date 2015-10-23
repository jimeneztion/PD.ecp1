package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;

public class ComandoGuardar extends Comando {

    private GestorMementos<MementoCalculadora> gestorMementos;

    private Calculator calculator;

    public ComandoGuardar(Originador cal, GestorMementos<MementoCalculadora> gestorMementos) {
        this.calculator = cal;
        this.gestorMementos = gestorMementos;

    }

    public String name() {
        return "Guardar";
    }

    public void execute() {
        String clave = IO.getIO().readString();
        gestorMementos.addMemento(clave, ((Originador) calculator).createMemento());
        IO.getIO().println("Guardado estado del sistema");
    }

}
