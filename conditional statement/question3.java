import java.util.*; 
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week no");
        int week = sc.nextInt();

        switch (week) {
               case 1:
               System.out.println("Sunday");
                break;
                case 2:
               System.out.println("Monday");
                break;
                case 3:
               System.out.println("Tuesday");
                break;

                case 4:
               System.out.println("Wednsday");
                break;

                case 5:
               System.out.println("Thrusday");
                break;

                case 6:
               System.out.println("Friday");
                break;

                case 7:
               System.out.println("Sturday");
                break;
        
            default:
                break;
        }
    }
    
}
