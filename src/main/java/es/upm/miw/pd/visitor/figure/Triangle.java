package es.upm.miw.pd.visitor.figure;

public class Triangle implements Figure {
    private double base;

    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void accept(Visitor v) {
        v.visitTriangle(this);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
