public class MathOperations {
    private int num1;
    private int num2;
    private int result;
    private double pi = 3.14;
    private double num3;
    private double num4;
    double results;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(double num3){
        this.num3 = num3;
    }

    public void setNum4(double num4){
        this.num4 = num4;
    }

    public int getResult() {
        return result;
    }

    public double getResults(){
        return results;
    }

    public void add() {
        result = num1 + num2;
    }

    public void subtract() {
        result = num1 - num2;
    }

    public void multiply() {
        result = num1 * num2;
    }

    public void divide() {
        result = num1 / num2;
    }

    public void c_area(){
        results = pi * (num3 * num3);
    }
    public void s_area(){
        results = num4 * num4;
    }
}
