
public class Radix {
    public static void main(String[] args) {
        System.out.println(nth(-3210, 0));
        System.out.println(nth(-3210, 1));
        System.out.println(nth(-3210, 2));
        System.out.println(nth(-3210, 3));

    }
    public static int nth(int n, int col) {
        n = Math.abs(n);
        String num = "" +n;
        if (col == 0) return Character.getNumericValue(num.charAt(num.length()-1));
        return Character.getNumericValue(num.charAt(num.length()-col-1));

    }

    // public static int length(int n) {
    //
    // }
}
