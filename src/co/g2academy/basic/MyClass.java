package co.g2academy.basic;

public class MyClass {

    int x;

    public MyClass() {
        x = 10;
    }

    public MyClass(int i) {
        x = i;
    }

    public MyClass(String s){
        x  = Integer.parseInt(s);
    }
}
