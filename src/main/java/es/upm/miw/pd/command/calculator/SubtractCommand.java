package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class SubtractCommand extends Comando {

    private Calculator cal;

    public SubtractCommand(Calculator calculator) {
        this.cal = calculator;
    }

    public String name() {
        return "Resta";
    }

    public void execute() {
        int i = IO.getIO().readInt();
        this.cal.subtract(i);
    }

}
