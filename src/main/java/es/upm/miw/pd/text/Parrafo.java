package es.upm.miw.pd.text;

public class Parrafo extends Escrito {

    private String SEPARATOR = "\n";

    public void add(Componente h) {
        if (h.esComponente())
            throw new UnsupportedOperationException("Error");
        else
            this.listado.add(h);
    }

    public String dibujar(boolean b) {
        String aux = "";
        for (int i = 0; i < this.listado.size(); i++) {
            aux += this.listado.get(i).dibujar(b);
        }

        return aux + SEPARATOR;
    }

}
