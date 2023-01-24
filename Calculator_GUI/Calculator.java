public class Calculator {
    private double pi = 3.14;
    private double num3;
    private double num4;
    double results;
    private int add(int a, int b) {
        return a + b;
    }
    private int subtract(int a, int b) {
        return a - b;
    }
    private int multiply(int a, int b) {
        return a * b;
    }
    private int divide(int a, int b) {
        return a / b;
    }
    
    public int addNumbers(int a, int b) {
        return add(a, b);
    }
    public int subtractNumbers(int a, int b) {
        return subtract(a, b);
    }
    public int multiplyNumbers(int a, int b) {
        return multiply(a, b);
    }
    public int divideNumbers(int a, int b) {
        return divide(a, b);
    }
    public void c_area(){
        results = pi * (num3 * num3);
    }
    public void s_area(){
        results = num4 * num4;
    }
}
