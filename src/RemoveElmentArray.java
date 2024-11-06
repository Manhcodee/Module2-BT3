import java.util.Scanner;

public class RemoveElmentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("Enter Element Array: ");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter elemet remove");
        int X = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_del = i;
                System.out.println("Phần tử " + X + " tìm thấy tại vị trí: " + index_del);
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Phần tử " + X + " không tồn tại trong mảng.");
        } else {
            for (int i = index_del; i < N - 1; i++) {
                array[i] = array[i + 1];
            }
            N--;
            System.out.println("Mảng sau khi xoá phần tử " + X + ":");
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
        }
        scanner.close();
    }
}
