package co.g2academy.basic;

public class CommandLine {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("Args [" + i + "]: " + args[i]);
        }
    }
}
