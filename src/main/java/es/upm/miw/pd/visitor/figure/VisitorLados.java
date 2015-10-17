package es.upm.miw.pd.visitor.figure;

public class VisitorLados implements Visitor {

    private double lados;

    private final double LADOS_TRIANGULO = 3;

    private final double LADOS_CUADRADO = 3;

    public VisitorLados() {
        lados = 0;
    }

    public void visitCircle(Circle c) {
        System.out.println("Visitando circulo Lados");
        this.setLados(Double.POSITIVE_INFINITY);
    }

    public void visitSquare(Square c) {
        System.out.println("Visitando Cuadrado Lados");
        this.setLados(LADOS_CUADRADO);
    }

    public void visitTriangle(Triangle c) {
        System.out.println("Visitando Triangulo Lados");
        this.setLados(LADOS_TRIANGULO);
    }

    public double getLados() {
        return this.lados;
    }

    public void setLados(double lados) {
        this.lados = +lados;
    }

}
