public class question1 {
    public static boolean isprime (int n){
        boolean isprime = true;
        for ( int i=2; i<=n-1; i++){
            if(n % i == 0 ) { // completly dividing
                isprime = false;
                break;

            }
        }
        return isprime;
    }
    public static void main(String[]args){
        System.out.println(isprime(10));
    }
    
}
