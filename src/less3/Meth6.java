package less3;
import java.util.Scanner;

public class Meth6  {
static double e = 0.00001;

        public static double func(double x) {

            return (Math.pow(x, 3) - 1.5 * Math.pow(x, 2) - x + 1.5);
        }
        public static double proiz(double x) {
            return (3 * x * x - 3 * x - 1);
        }

        public static void Resh(double x0, double x1) {
            System.out.println(x1);

            x1 = x0 - func(x0) / proiz(x0);


            if (Math.abs(x1 - x0) > e) {
                x0 = x1;
                x1 = x0 - func(x0) / proiz(x0);
                Resh(x0, x1);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("x0 равен= ");
            double x0 = sc.nextDouble();
            System.out.println("Нахождение корня с применением рекурсивного алгоритма");
            double x1 = x0 - func(x0) / proiz(x0);
            Resh(x0, x1);
        }
    }