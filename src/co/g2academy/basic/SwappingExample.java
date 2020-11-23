package co.g2academy.basic;

public class SwappingExample {

    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        System.out.println("Before swapping, a = " + a
                + " and b = " + b);
        swapFunction(a, b);
        System.out.println("Now, before and after values will be the same");
        System.out.println("After swapping, a = " + a
                + " and b = " + b);
    }

    public static void swapFunction(int a, int b) {
        System.out.println("Before swapping (inside), a = "
                + a + " and b = " + b);
        // swap variable a and b
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping (inside), a = "
                + a + " and b = " + b);
    }
}
