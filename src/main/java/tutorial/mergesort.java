package tutorial;

import java.util.Arrays;

public class mergesort {

    public static void main(String[] args) {
        int[] input = new int[]{9,5, 2, 4, 7, 1, 3, 8, 2, 6};
        System.out.println(Arrays.toString(input));
        sort(input, 0, input.length);
        System.out.println(Arrays.toString(input));
    }

    private static void sort(int[] A, int p, int r) {
        if (p < r - 1) {
            int q = (p + r) / 2;
            sort(A, p, q);
            sort(A, q, r);
            merge(A, p, q, r);
        }
    }


    // 原则：包头不包尾
    private static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p;
        int n2 = r - q;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = A[q + j];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        for (int k = p; k < r; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i = i + 1;
            } else {
                A[k] = R[j];
                j = j + 1;
            }
        }
    }

}
