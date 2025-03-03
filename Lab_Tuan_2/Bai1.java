import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int i;
        for(i = 0; i < n; i++) {
            System.out.println("Nhap arr [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        for(i = 0; i < n; i++)
            System.out.println("Arr [" + i + "]: " +  arr[i]);

        int min, max;
        min = max = arr[0];
        for(i  = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Min, max: " + min + ", " + max);

        int max1 = 0;
        for(i = 1; i < n; i++) {
            if (arr[i] > arr[max1]) {
                max1 = i;
            }
        }
        System.out.println("Vi tri phan tu lon nhat: " + max1);

        Arrays.sort(arr);
        for (i = 0; i < n; i++) {
            System.out.print( arr[i] + " ");
        }
    }
}