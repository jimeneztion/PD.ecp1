package es.upm.miw.pd.visitor.figure;

public class VisitorFigure implements Visitor {

    private double area;

    private final double PI = 3.14;

    public VisitorFigure() {
        area = 0;
    }

    public void visitCircle(Circle c) {
        System.out.println("Visitando circulo");
        this.setArea(PI * c.getRadius() * c.getRadius());
    }

    public void visitSquare(Square c) {
        System.out.println("Visitando Cuadrado");
        this.setArea(c.getSide() * c.getSide());
    }

    public void visitTriangle(Triangle c) {
        System.out.println("Visitando Triangulo");
        this.setArea((c.getBase() * c.getHeight()) / 2);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = +area;
    }

}
