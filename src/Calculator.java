public class Calculator {
    double result;
    public double  multiply(double a, double b) {
        result = a*b;
        return result;
    }
    public double multiply(double a, double b, double c) {
        result = a*b*c;
        return result;
    }

    public double getResult() {
        return result;
    }
}
