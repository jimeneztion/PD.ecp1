package es.upm.miw.pd.text;

public class FactoriaCaracter {

    private static FactoriaCaracter _instance = null;
    
    private Caracter c;

    private Componente comp;

    private FactoriaCaracter() {
        c = new Caracter();
    }

    public static FactoriaCaracter getFactoria() {
        if (_instance == null)
            new FactoriaCaracter();

        return _instance;
    }

    public Componente get(char c) {
        return comp;
    }

}
