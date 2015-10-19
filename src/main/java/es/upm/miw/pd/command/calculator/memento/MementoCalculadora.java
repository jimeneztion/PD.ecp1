package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;

public class MementoCalculadora extends Comando {

    private Calculator cal;
    

    public MementoCalculadora(Calculator calculator) {
        this.cal = calculator;
    }

    public String name() {
        return "Guardar";
    }

    public void execute() {
       
    }

}
