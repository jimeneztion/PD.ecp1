package es.upm.miw.pd.command.calculator.memento.PILAS;

import upm.jbb.IO;

public class ComandoGuardar extends Comando {

    private Calculator calculadora;

    private GestorEstados gestor;

    public ComandoGuardar(Calculator calculator, GestorEstados estados) {
        super();
        this.calculadora = calculator;
        this.gestor = estados;
    }

    public String name() {
        return "Guardar";
    }

    public void execute() {
        Calculator aux = new Calculator();
        int total = this.calculadora.getTotal();
        aux.setTotal(total);
        this.gestor.stack(aux);
        IO.getIO().println("Guardado estado del sistema");
    }

}
