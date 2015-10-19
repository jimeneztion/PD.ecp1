package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

    private static FactoriaCaracter _instance = null;

    private Map<Character, Caracter> mapCaracteres = new HashMap<>();

    private FactoriaCaracter() {
        this.mapCaracteres = new HashMap<>();
    }

    public static FactoriaCaracter getFactoria() {
        if (_instance == null)
            _instance = new FactoriaCaracter();

        return _instance;
    }

    public Caracter get(char c) {

        if (mapCaracteres.containsKey(c)) {
            return mapCaracteres.get(c);
        } else {
            Caracter caracter = new Caracter();
            caracter.setC(c);
            mapCaracteres.put(c, caracter);
            return caracter;
        }

    }

}
