package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ResetCommand extends Comando {

    private Calculator cal; 

    public ResetCommand(Calculator cal) {
       this.cal = cal;
    }

    
    public String name() {
        return "Resta";
    }

    public void execute() {
        int i = IO.getIO().readInt();
        cal.subtract(i);
    }

}
