package less2;
import java.io.IOException;
import java.util.Scanner;

public class Mass {
    public static void main(String[] args) {
        int myArray[];
        vvod1viv();
    }

    public static void vvod1viv() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("размер массива: ");
        int size = scanner.nextInt();
        int myArray[] = new int[size];
        System.out.println("элементы массива:");
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
            System.out.print(" " + myArray[i]);
        }
    }
}

