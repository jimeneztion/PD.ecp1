package es.upm.miw.pd.composite.expression;

public class Sumar extends Operacion {

    public Sumar(ExpresionMain expresion1, ExpresionMain expresion2) {
        super(expresion1, expresion2);
    }

    public int operar() {
        return (this.getExpresion1().operar() + this.getExpresion2().operar());
    }

    public String toString() {
        return ("(" + this.getExpresion1().toString() + "+" + this.getExpresion2().toString() + ")");
    }
}
