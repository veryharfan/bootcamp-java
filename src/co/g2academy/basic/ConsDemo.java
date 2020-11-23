package co.g2academy.basic;

public class ConsDemo {

    public static void main(String[] args) {
        //class object => inisialisasi class menjadi object lewat new keyword
        //dan constructor
        //object adalah inisialisasi dari class
        //object intantiation of a Class
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(10);
        MyClass t3 = new MyClass("20");
        System.out.println(t1.x + " " + t2.x + " " + t3.x);
    }
}
