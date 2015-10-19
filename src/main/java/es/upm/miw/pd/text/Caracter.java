package es.upm.miw.pd.text;

public class Caracter extends Componente {

    char c;

    public Caracter() {
        super();
    }

    public char getC() {
        return this.c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void add(Componente h) {}

    public String dibujar(boolean b) {
        if (b)
            return Character.toString(Character.toUpperCase(this.c));
        else
            return Character.toString(this.c);
    }

    public boolean esComponente() {
        return false;
    }

}
