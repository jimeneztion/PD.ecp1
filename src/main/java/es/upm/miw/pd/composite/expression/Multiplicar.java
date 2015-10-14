package es.upm.miw.pd.composite.expression;

public class Multiplicar extends Operacion {

    public Multiplicar(ExpresionMain expresion1, ExpresionMain expresion2) {
        super(expresion1, expresion2);
    }

    @Override
    public int operar() {
        return (this.getExpresion1().operar() * this.getExpresion2().operar());
    }

    public String toString() {
        return ("(" + this.getExpresion1().toString() + "*" + this.getExpresion2().toString() + ")");
    }

}
