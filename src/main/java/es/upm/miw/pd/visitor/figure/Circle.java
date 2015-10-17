package es.upm.miw.pd.visitor.figure;

public class Circle implements Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void accept(Visitor v) {
        v.visitCircle(this);
    }

}
