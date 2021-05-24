package less3;
import java.util.Scanner;

public class Meth8 {
    static double e = 0.00001;

    public static double func(double x) {
        return (Math.pow(x, 3) - 1.5 * Math.pow(x, 2) - x + 1.5);
    }

    public static void divideTwoRec(double a, double b) {
        System.out.println((a + b) / 2);
        if (Math.abs(b - a) > e) {

            double x = (a + b) / 2;
            if (func(a) * func(x) > 0) {
                a = x;
            }
            else {
                b = x;
            }
            divideTwoRec(a, b);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("a= ");

        double a = sc.nextDouble();

        System.out.println("b= ");
        double b = sc.nextDouble();

        divideTwoRec(a, b);
    }
}
