package es.upm.miw.pd.command.calculator.memento;

import java.util.HashMap;
import java.util.Map;

public class GestorMementos<T> {
    private Map<String, T> listaMementos;

    public GestorMementos() {
        this.listaMementos = new HashMap<String, T>();
    }

    public void addMemento(String clave, T memento) {
        this.listaMementos.put(this.listaMementos.size() + ":" + clave, memento);
    }

    public T getMemento(String clave) {
        return this.listaMementos.get(clave);
    }

    public String[] keys() {
        return this.listaMementos.keySet().toArray(new String[0]);
    }
}
