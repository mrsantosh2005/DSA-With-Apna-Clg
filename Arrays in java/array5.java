import java.util.*;

public class array5 {

    public static void reverse(int number[]) {

        int start = 0;
        int end = number.length - 1;

        while (start < end) {
            // swap
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;

            start++;
            end--;

        }
    }

    public static void main(String[] args) {
        int number[] = { 10, 8, 6, 4, 2, 1 };
        reverse(number);
        int n = number.length;
        for(int i = 0; i < n; i++) {
        System.out.print(number[i] + " ");
        }
        System.out.println();

    }

}
