public class Method{
    public static void main(String[] args) {
        series(10);
        series(20);
        series(30);
        series(15);
        series(110);
        series(939847695);
    }
    static void series(int n) {
        int a = 0;
        int b = 1;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}
