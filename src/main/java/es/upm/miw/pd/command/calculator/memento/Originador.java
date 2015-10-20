package es.upm.miw.pd.command.calculator.memento;

public class Originador extends Calculator implements Mementable<MementoCalculadora> {

    public MementoCalculadora createMemento() {
        return new MementoCalculadora(this.getTotal());
    }

    public void restoreMemento(MementoCalculadora memento) {
        this.setTotal(memento.getValor());
    }

}
