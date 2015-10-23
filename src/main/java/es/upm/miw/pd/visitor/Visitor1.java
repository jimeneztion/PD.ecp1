package es.upm.miw.pd.visitor;

public class Visitor1 extends Visitor {

    public void visitElementA(ElementA e) {
        System.out.println("Visitador 1 --> elemento: " + e.getAttributeA());
    }

    public void visitElementB(ElementB e) {
        System.out.println("Visitador 1 --> elemento: " + e.getAttributeB());
    }

}
