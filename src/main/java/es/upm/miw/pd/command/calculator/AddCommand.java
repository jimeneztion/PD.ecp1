package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class AddCommand extends Comando {

    private Calculator cal;

    public AddCommand(Calculator cal) {
        this.cal = cal;
    }

    public String name() {
        return "Sumar";
    }

    public void execute() {
        int i = IO.getIO().readInt();
        cal.add(i);
    }

}
