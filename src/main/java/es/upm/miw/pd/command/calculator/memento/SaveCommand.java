package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;

public class SaveCommand extends Comando {

    private Calculator cal;
    

    public SaveCommand(Calculator calculator) {
        this.cal = calculator;
    }

    public String name() {
        return "Guardar";
    }

    public void execute() {
       
    }

}
