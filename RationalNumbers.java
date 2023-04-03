public class RationalNumbers {
    private int numerator, denominator;
    
    public RationalNumbers(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    
    public RationalNumbers() {
        this.numerator = 1;
        this.denominator = 1;
    }

    public RationalNumbers(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }


    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }


    public int getDenominator() {
        return denominator;
    }


    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "Rational number: " + this.numerator + "/" + this.denominator;
    }
    public static void main(String[] args) {
        RationalNumbers rationalNumbers = new RationalNumbers(2,3);
        System.out.println(rationalNumbers);
    }
}
