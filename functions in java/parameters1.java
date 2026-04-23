public class parameters1 {
    // function to calculate sum of 2 numbers 
    public static int sum (int a, int b){
        return a + b;
    }
    // function to calculate sum of 3 numbers
    public static int sum (int a, int b, int c){
        return a + b + c;
    }
    // function to calculate sum of 4 numbers , float values
    public static float sum (float a, float b, float c, float d){

        float summ = a + b + c + d ;
        return summ;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,2));
        System.out.println(sum(2,1,2));
        System.out.println(sum(2.2f,1.7f,2.9f,3.5f));
        
    }
}
