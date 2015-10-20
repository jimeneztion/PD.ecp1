package es.upm.miw.pd.command.calculator.memento;

public class GestorEstados {
    
    protected Stack<Calculator> pilaDeEstados;

    public GestorEstados() {
        this.pilaDeEstados = new Stack<Calculator>();
    }
    
    public GestorEstados(Stack<Calculator> pilaDeEstados) throws NullPointerException {
        if (pilaDeEstados == null)
            throw new NullPointerException("Cola no puede ser nula");
        this.pilaDeEstados = pilaDeEstados;
    }
    

    public Calculator top() {
        if (!canUnStack())
            return null;
        return pilaDeEstados.sample();
    }

    public boolean canStack(Calculator c) {
        if (c == null)
            throw new NullPointerException("El estado no puede ser nulo");

        return true;
    }

    public boolean canUnStack() {
        return (desapilable() && !isEmpty());
    }

    public Calculator unstack() {
        if (!canUnStack())
            return null;
        return pilaDeEstados.unstack();
    }

    public boolean stack(Calculator c) {
        if (!canStack(c))
            return false;
        pilaDeEstados.stack(c);
        return true;
    }

    public boolean isEmpty() {
        return pilaDeEstados.isEmpty();
    }

    public boolean desapilable() {
        return true;
    }

}
