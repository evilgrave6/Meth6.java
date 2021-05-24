package less1;
import java.util.Scanner;

    public class Fib {
        public static void main(String[] args) {
            int index = 0;
            while (true) {
                System.out.println(f(index));
                index++;
            }
        }

        public static long f(int i) {
            if (i == 0) return 0;
            if (i <= 2) return 1;

            long fibTerm = f(i - 1) + f(i - 2);
            return fibTerm;
        }
    }