package util;

public enum Grade {

    F("F", 0),
    D("D", 1),
    C("C", 2),
    B("B", 3),
    A("A", 4);


    private  String stringValue;
    private int numericValue;

    // Grade için string ve numeric değerler tutan constructor oluşturuldu.
    private Grade(String stringValue, int numericValue) {
        this.stringValue = stringValue;
        this.numericValue = numericValue;
    }

    // Get metotları tanımlandı.
    public String getStringValue() {
        return stringValue;
    }

    public double getNumericValue() {
        return numericValue;
    }


    @Override
    public String toString() {
        return "Grade " + this.stringValue +
                " corresponds to numeric grade " +
                this.numericValue + '.';
    }
}
