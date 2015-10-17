package es.upm.miw.pd.visitor.figure;

public class Square implements Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

   
    public double getSide() {
        return side;
    }

  
    public void setSide(double side) {
        this.side = side;
    }

    public void accept(Visitor v) {
        v.visitSquare(this);

    }

}
