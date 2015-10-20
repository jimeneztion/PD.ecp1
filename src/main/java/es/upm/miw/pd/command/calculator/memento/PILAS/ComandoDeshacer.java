package es.upm.miw.pd.command.calculator.memento.PILAS;

import upm.jbb.IO;

public class ComandoDeshacer extends Comando {

    private Calculator calculadora;

    private GestorEstados gestor;

    public ComandoDeshacer(Calculator calculator, GestorEstados estados) {
        super();
        this.calculadora = calculator;
        this.gestor = estados;
    }

    public String name() {
        return "Restaurar";
    }

    public void execute() {
        if (!this.gestor.canUnStack())
            IO.getIO().println("No existe punto de restauracion del estado del sistema");
        else {
            Calculator aux = this.gestor.unstack();
            setCalculadora(aux);
            IO.getIO().println("Restaurando estado del sistema");
        }

    }

    public void setCalculadora(Calculator calculadora) {
        this.calculadora.setTotal(calculadora.getTotal());
    }

}
