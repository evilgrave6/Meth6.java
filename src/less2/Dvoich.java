package less2;
import java.util.Scanner;

 public class Dvoich {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("введите  число: ");
            int n = scanner.nextInt();
            System.out.print("ваше число в двоичной системе сч. равен= "+dec(n));
        }

        private static int dec(int n){
            if(n == 0 )
                return 0;
            else
                return  n % 2 + 10 * dec(n/2);
        }
    }