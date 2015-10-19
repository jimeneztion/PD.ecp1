package es.upm.miw.pd.text;

public class Texto extends Escrito {

    private String separator = "\n";
    
    

    public void add(Componente h) {
        if (h.esComponente())
            this.listado.add(h);
        else
            throw new UnsupportedOperationException("error");
    }

    public String dibujar(boolean b) {
        String aux = "";
        for (int i = 0; i < listado.size(); i++) {
            aux += listado.get(i).dibujar(b);
        }

        return aux + separator;
    }

}
