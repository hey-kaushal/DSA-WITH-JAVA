public class _5_biocoff {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;

    }

    public static int biocoff(int n, int r) {
        int nf = factorial(n);
        int rf = factorial(r);
        int ncr = factorial(n - r);
        int biocoffe = nf / (rf * ncr);
        return biocoffe;

    }

    public static void main(String arge[]) {
        int NCR = biocoff(10, 5);
        System.out.println("bionomial cofficent " + NCR);

    }

}
