import java.util.*;
public class array3 {
    public static int largest(int number[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<number.length; i++){
            if (largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {2 ,8 ,3 ,4 ,5 ,6 };
        System.out.println(" the largest number = " + largest(numbers));
    }
    
}
