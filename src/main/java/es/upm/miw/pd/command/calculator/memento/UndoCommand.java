package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;

public class UndoCommand extends Comando {

    private Calculator cal;
    

    public UndoCommand(Calculator calculator) {
        this.cal = calculator;
    }

    public String name() {
        return "Guardar";
    }

    public void execute() {
       
    }

}
