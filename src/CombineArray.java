import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Enter array 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Enter elements for the first array: ");
        for (int i = 0; i < size1 ; i++) {
            System.out.print("Element " + (i + 1) + ':');
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter elements for the second array: ");
        for (int i = 0; i < size2 ; i++) {
            System.out.print("Element " + (i + 1) + ':');
            array2[i] = scanner.nextInt();
        }

        int[] array3 = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
        }
    }
}
