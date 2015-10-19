package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class Escrito extends Componente {

    public List<Componente> listado;

    public Escrito() {
        super();
        this.listado = new ArrayList<Componente>() ;
    }
    
    public boolean esComponente() {
        return true;
    }
    
    
    

}
