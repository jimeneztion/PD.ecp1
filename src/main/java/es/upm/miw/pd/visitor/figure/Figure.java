package es.upm.miw.pd.visitor.figure;

public interface Figure {

    void accept(Visitor v);

    double area();

    double lados();

}
