package es.upm.miw.pd.text;

public class Parrafo extends Escrito {

    private Componente c;

    private String separator = "\n";

    public void add(Componente h) {
        if (h.esComponente()) {
            throw new UnsupportedOperationException("Error");
        } else {
            this.listado.add(h);
        }

    }

    public String dibujar(boolean b) {
        String aux = "";
        for (int i = 0; i < listado.size(); i++) {
            aux += listado.get(i).dibujar(b);
        }

        return aux + separator;

    }

}
