import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays1 {
    public static void mergeArrays(int[] X, int[] Y, int m, int n) {
        // Move non-empty elements in X[] to the beginning
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }

        // Merge X[] and Y[]
        int i = k + 1; // Start from the first non-empty position in X[]
        int j = 0; // Start from the beginning of Y[]
        int idx = 0; // Index for placing merged elements in X[]

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[idx] = X[i];
                i++;
            } else {
                X[idx] = Y[j];
                j++;
            }
            idx++;
        }

        // Fill remaining vacant cells in X[] with zeros
        while (j < n) {
            X[idx] = Y[j];
            idx++;
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array X: ");
        int m = scanner.nextInt();
        int[] X = new int[m];

        System.out.println("Enter the elements of array X (separated by spaces):");
        for (int i = 0; i < m; i++) {
            X[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of array Y: ");
        int n = scanner.nextInt();
        int[] Y = new int[n];

        System.out.println("Enter the elements of array Y (separated by spaces):");
        for (int i = 0; i < n; i++) {
            Y[i] = scanner.nextInt();
        }

        mergeArrays(X, Y, m, n);

        System.out.println("Merged Array X[]:");
        System.out.println(Arrays.toString(X));
    }
}