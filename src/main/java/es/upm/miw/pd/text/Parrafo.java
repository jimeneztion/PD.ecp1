package es.upm.miw.pd.text;

public class Parrafo extends Escrito {

    private Componente c;

    private String separator = "\n";

    @Override
    public void add(Componente h) {
        this.c = h;

    }

    @Override
    public String dibujar(boolean b) {
        String aux = "";
        for (int i = 0; i < listado.size(); i++) {
            aux += listado.get(i).dibujar(b);
        }

        return aux + separator;
        
        
       

    }

    @Override
    public String toString() {
        return c.toString();
    }

   

}
