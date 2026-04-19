import java.util.*;
public class question2 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in) ;
        System.out.println("enter the temprature ");
        int temprature = sc.nextInt();

        if ( temprature > 100){
            System.out.println("you are fevar");
        }
        else {
            System.out.println("you are not feaver ");
        }
    }
    
}
