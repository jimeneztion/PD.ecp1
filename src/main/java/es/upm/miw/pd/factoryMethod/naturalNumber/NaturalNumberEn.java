package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {

    private static final String[] textValue = { "zero", "one", "two", "three", "four", "five" };

    public NaturalNumberEn(int value) {
        super(value);
    }

    public String getTextValue() {
        int valor = this.getValue();
        if (this.getValue() < textValue.length)
            return NaturalNumberEn.textValue[valor];
        else
            return "???";

    }

}
