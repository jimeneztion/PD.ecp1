import es.upm.miw.pd.composite.expression.Expresion;

public abstract class Operacion extends Expresion {

    private Expresion expresion1, expresion2;

    public Operacion(Expresion expresion1, Expresion expresion2) {
        super();
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }

    public Expresion getExpresion1() {
        return expresion1;
    }

    public void setExpresion1(Expresion expresion1) {
        this.expresion1 = expresion1;
    }

    public Expresion getExpresion2() {
        return expresion2;
    }

    public void setExpresion2(Expresion expresion2) {
        this.expresion2 = expresion2;
    }

    public abstract int operar();
    

}
