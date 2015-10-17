package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class PrintCommand extends Comando {

    private Calculator cal;

    public PrintCommand(Calculator calculator) {
        this.cal = calculator;
    }

    public String name() {
        return "Imprimir";
    }

    public void execute() {
        int i = cal.getTotal();
        IO.getIO().println(i);
    }

}
