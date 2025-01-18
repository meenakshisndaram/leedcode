package rotatefirstelementtolast;

import java.util.Arrays;

class Rotate {
    public static void main(String[] args) {
        int[] x = { 2, 3, 4, 5, 6, 7, 8 };
        int firstElement = x[0];


        for (int i = 0; i < x.length - 1; i++) {
            x[i] = x[i + 1];
        }

      
        x[x.length - 1] = firstElement;

        // Output the rotated array
        System.out.println(Arrays.toString(x));
    }
}
