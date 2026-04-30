import java.util.*;
public class question3 {
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        int pencil = sc.nextInt();
        int pen = sc.nextInt();
        int eresar= sc.nextInt();

        int total = pencil + pen + eresar ;
        double gst = (total * 18)/100;

        System.out.println("Your total = " + total);
        System.out.println("Your gst is=" + gst);

        double bill = total + gst ;
        System.out.println( "your bill is =" + bill);

    }

    
}
