
public class Radix {
    public static void main(String[] args) {
        System.out.println(nth(-3210, 0));
        System.out.println(nth(-3210, 1));
        System.out.println(nth(-3210, 2));
        System.out.println(nth(-3210, 3));

    }
    public static int nth(int n, int col) {
        return (Math.abs(n) / (int)(Math.pow(10, col))) % 10;
    }

    public static int length(int n) {
        if (n == 0) return 1;
        else return (int) (Math.log10(Math.abs(n)) + 1);
    }
}
