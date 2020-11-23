package co.g2academy.basic;

public class TestGreeting {
    public static void main(String[] args) {
        Greeting very = new Greeting();
        very.name = "very";
        very.greet();

        Greeting harfan = new Greeting();
        harfan.name = "harfan";
        harfan.greet();

        very.greet();

        System.out.println("This is IDE help");
    }
}