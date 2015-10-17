package es.upm.miw.pd.visitor.figure;

public interface Visitor {
    
    public abstract void visitCircle(Circle figure);

    public abstract void visitSquare(Square figure);
    
    public abstract void visitTriangle(Triangle figure);

}
