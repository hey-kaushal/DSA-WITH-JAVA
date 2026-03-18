public class _6_functionoverloading {

    // public static int sum(int a, int b){
    // return a+b;
    // }
    // public static int sum(int a, int b ,int c){
    // return a+b+c;
    // }
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String arge[]) {
        // System.out.println(sum(5,3));
        // System.out.println(sum(5,3,1));
        System.out.println(sum(5, 3));
        System.out.println(sum(5.3f, 3.5f));

    }

}
