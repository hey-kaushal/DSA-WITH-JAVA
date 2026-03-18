import java.util.*;

public class _2_paramenter {

    public static int parameter(int a, int b){  //parameter or formal paramaters
        int sum = a+b;
        return sum;
    }

    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int sum =parameter(a,b);   //arguments or actual parameters
        System.out.println("sum of 2 number is "+sum);

    }

}
