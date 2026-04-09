import java.util.*;
public class large{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A =sc.nextInt();
    int B =sc.nextInt();
    int C =sc.nextInt();

    if ((A >= B)&&(A >=C )){
       System.out.println("greater number" + A);
    }
    else if (B>=C)
    {
        System.out.println("greater is number " + B);
    }
    else 
     {
        System.out.println("greater number is "+ C);
    }
}



}