package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public class FactoriaCaracter {

    private static FactoriaCaracter _instance = null;

    private List<Caracter> listadoFactoria;

    private FactoriaCaracter() {
        this.listadoFactoria = new ArrayList<Caracter>();
    }

    public static FactoriaCaracter getFactoria() {
        if (_instance == null)
            _instance = new FactoriaCaracter();

        return _instance;
    }

    public Componente get(char c) {

        if (this.listadoFactoria.contains(c))
            return this.listadoFactoria.get(c);

        else {
            Caracter caracter = new Caracter();
            caracter.setC(c);
            this.listadoFactoria.add(caracter);
            return caracter;
        }

    }

}
