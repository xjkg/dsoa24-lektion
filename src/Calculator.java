public class Calculator {
    double result;
    public void  multiply(double a, double b) {
        result = a*b;
    }
    public void multiply(double a, double b, double c) {
        result = a*b*c;
    }

    public double getResult() {
        return result;
    }
}
