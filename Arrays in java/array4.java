import java.util.*;
public class array4 {
    public static int binaraysearch(int number[], int key){
        int start = 0; 
        int end = number.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;

            if (number[mid] == key){
                return mid;
            }
            if (number[mid] < key){
                // right
                start = mid+1;
            } else {
                // left
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2 ,4 ,6 ,8 ,10 ,12 ,14 ,16 ,18 ,20};
        int key = 12;
        System.out.println("index for key is " + binaraysearch(number, key));
    }

}