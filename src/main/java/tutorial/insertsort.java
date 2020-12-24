package tutorial;

import java.util.Arrays;

public class insertsort {

    public static void main(String[] args) {
        int[] input = new int[]{5, 2, 4, 6, 1, 3, 7, 8, 1002, 57};
        System.out.println(Arrays.toString(input));
        algorithms(input);
        System.out.println(Arrays.toString(input));

    }

    private static void algorithms(int[] input) {
        if (input.length < 2) {
            return;
        }

        for (int j = 1; j < input.length; j++) {
            int key = input[j];
            int i = j - 1;
            while (i >= 0 && input[i] > key) {
                input[i + 1] = input[i];
                i = i - 1;
            }
            input[i + 1] = key;
        }
    }

}
