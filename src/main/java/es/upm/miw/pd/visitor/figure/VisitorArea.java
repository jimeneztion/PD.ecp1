package es.upm.miw.pd.visitor.figure;

public class VisitorArea implements Visitor {

    public void visitCircle(Circle circle) {
        System.out.println("Visitando circulo");
        System.out.println(circle.area());
    }

    public void visitSquare(Square square) {
        System.out.println("Visitando Cuadrado");
        System.out.println(square.area());
    }

    public void visitTriangle(Triangle triangle) {
        System.out.println("Visitando Triangulo");
        System.out.println(triangle.area());
    }

}
