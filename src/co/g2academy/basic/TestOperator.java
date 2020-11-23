package co.g2academy.basic;

public class TestOperator {

    public static void main(String[] args) {
        //logical operator
        int x = 10;
        System.out.println( x < 11 && x < 100);

        int y = 100;

        System.out.println( y > x || x < y);

        int z = y >> 1;
        System.out.println(z);
        System.out.println(z / 4);
        System.out.println(z << 1);

        int maxInteger = Integer.MAX_VALUE;
        System.out.println(maxInteger);

        double d = 1_000_000_000_000D;
        int integer = (int) d;
        System.out.println(d);
        System.out.println(integer);

    }
}
