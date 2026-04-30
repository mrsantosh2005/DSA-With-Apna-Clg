public class question2 {

    public static void dectobin(int n){
        int mynum = n;
        int pow = 0;
        int binnum = 0;

        while (n > 0){
            int rem = n % 2;
            binnum = binnum + ( rem * (int)Math.pow(10,pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary form of " + mynum + " = " + binnum );
    }
    public static void main(String[] args) {
        dectobin(10);
    }
     public static void bintodec(int n){
        int mynum = n;
        int pow = 0;
        int binnum = 0;

        while (n > 0){
            int rem = n % 10;
            decnum = decnum + ( rem * (int)Math.pow(2,pow));
            pow++;
            binnum = binnum/ 10;
        }
        System.out.println("binary form of " + mynum + " = " + decnum );
    }
    public static void main(String[] args) {
        dectobin(10);
    }
}