import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        do {
            System.out.println("enter your number");
            int number = sc.nextInt();
            
            if (number % 20 == 0) {
                break;
            }
            System.out.println(number);
        }while(true);

        
    }
    
}
