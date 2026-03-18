public class _4_factorial {

    public static int factorial(int n){
         int f=1;
         for (int i= 1;i<=n;i++){
             f=f*i;
         }
         return f;

    }
    public static void main (String arge[]){
        System.out.println(factorial(50));

    }
    
}
