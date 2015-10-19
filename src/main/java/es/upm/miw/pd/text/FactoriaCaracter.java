package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public class FactoriaCaracter {

    private static FactoriaCaracter _instance = null;

    private List<Caracter> listado;

    private FactoriaCaracter() {
        listado = new ArrayList<Caracter>();
    }

    public static FactoriaCaracter getFactoria() {
        if (_instance == null)
            new FactoriaCaracter();

        return _instance;
    }

    public Componente get(char c) {
       if(this.listado.contains(c))
           return this.listado.get(c);
       
       else{
           Caracter caracter = new Caracter();
           caracter.setC(c);
           this.listado.add(caracter);
           return caracter;
       }
           
    }

}
