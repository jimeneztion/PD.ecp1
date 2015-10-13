package es.upm.miw.pd.composite.expression;

public class Dividir extends Operacion {

    
    public Dividir(ExpresionMain expresion1, ExpresionMain expresion2) {
        super(expresion1, expresion2);
    }

    public int operar() {
        return (this.getExpresion1().operar() / this.getExpresion2().operar());
    }

}
