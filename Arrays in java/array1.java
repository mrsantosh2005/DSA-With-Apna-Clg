import java.util.*;

public class array1 {
    public static void main(String[] args) {
        int marks[]= new int [100];
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your physics marks");
        marks[0] = sc.nextInt(); // physics marks
        System.out.println(" enter your chemistry marks");
        marks[1] = sc.nextInt(); // chemistry mraks
        System.out.println("enter your math marks ");
        marks[2] = sc.nextInt(); // math marks 

       

        System.out.println("physics marks = " + marks[0]);
        System.out.println("chemistry marks = " + marks[1]);
        System.out.println("math marks = " + marks[2]);
        System.out.println("your total marks ");
        
         int percentage  = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println( "percentage = " + percentage + "%");
    }
    
}
