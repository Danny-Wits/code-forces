import java.util.Scanner;

public class dynamicArray {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length : ");
    int length = scanner.nextInt();
    int [] array = new int[length];
    for (int i = 0; i < length; i++) {
        array[i]=scanner.nextInt();
    }
    for (int i : array) {
        System.out.println(i);
    }
    scanner.close();
    }
}
