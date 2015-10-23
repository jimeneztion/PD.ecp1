package es.upm.miw.pd.command.calculator.memento;

public class Calculator {
    private int total;

    public Calculator() {
        this.reset();
    }

    public int getTotal() {
        return total;
    }

    public void add(int valor) {
        this.setTotal(this.total + valor);
    }

    public void subtract(int valor) {
        this.setTotal(this.total - valor);
    }

    public void reset() {
        this.setTotal(0);
    }

    public boolean isMultiUnstakable() {
        return false;
    }

    protected void setTotal(int total) {
        this.total = total;
    }
}
