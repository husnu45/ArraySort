import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz : ");
        int arrSize = scanner.nextInt();

        int[] numbers = new int[arrSize];

        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sıralama
        Arrays.sort(numbers);

        System.out.println("Sıralanmış dizi : " + Arrays.toString(numbers));
    }
}
