package es.upm.miw.pd.command.calculator.memento;

import java.util.Stack;

public abstract class Comando {

    private Stack<Double> pila;
    
    public Comando() {
        super();
        this.pila = new Stack<Double>();
    }

    public void execute() {
    }

    public String name() {
        return "";
    }

  

}
