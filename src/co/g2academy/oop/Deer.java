package co.g2academy.oop;

public class Deer extends Animal implements Vegetarian{

    public static void main(String[] args) {
        Deer d = new Deer();
        Animal a = d;
        Vegetarian v = new Deer();
        Object o = new Deer();
    }
}
