package es.upm.miw.pd.text;

public class Parrafo extends Componente {

    private Componente c;

    private String separator = "\n";

    @Override
    public void add(Componente h) {
        this.c = h;

    }

    @Override
    public String dibujar(boolean b) {
        if (b)
            return c.toString().toUpperCase() + separator;

        else
            return c.toString() + separator;

    }

    @Override
    public String toString() {
        return c.toString();
    }

}
