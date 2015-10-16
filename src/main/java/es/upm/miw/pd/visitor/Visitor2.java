package es.upm.miw.pd.visitor;

public class Visitor2 extends Visitor {

    private int a, b;

    public Visitor2() {
        super();
        this.a = 0;
        this.b = 0;
    }

    public void visitElementA(ElementA e) {
        this.setA(this.a + 1);
    }

    public void visitElementB(ElementB e) {
        this.setB(this.b + 1);
    }

    public int getAs() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getBs() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}
