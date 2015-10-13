package es.upm.miw.pd.composite.expression;

public class Numero extends ExpresionMain {

    private int numero;

    public Numero(int numero) {
        super();
        this.numero = numero;
    }

    public int operar() {
        return this.numero;
    }

}
