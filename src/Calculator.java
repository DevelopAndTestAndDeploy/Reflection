import java.util.concurrent.Callable;

@MyAnnotations(value1 = "123", value2 = "456")
public class Calculator {

    private double num1;
    private  double num2;

    public Calculator() {
        System.out.println("Default constructor");
    }

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2)
    {
        this.num2 = num2;
    }

    public double sum(double n1, double n2) {
        return n1+n2;


    }



}
