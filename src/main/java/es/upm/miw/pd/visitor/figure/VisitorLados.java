package es.upm.miw.pd.visitor.figure;

public class VisitorLados implements Visitor {

    public void visitCircle(Circle circle) {
        System.out.println("Visitando circulo lados");
        System.out.println(circle.lados());

    }

    public void visitSquare(Square square) {
        System.out.println("Visitando Cuadrado lados");
        System.out.println(square.lados());
    }

    public void visitTriangle(Triangle triangle) {
        System.out.println("Visitando Triangulo lados");
        System.out.println(triangle.lados());
    }

}
