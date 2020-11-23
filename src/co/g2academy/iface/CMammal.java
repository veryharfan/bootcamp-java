package co.g2academy.iface;

public class CMammal implements IAnimal {

    public void eat() {
        System.out.println("Mammal Eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String[] args) {
        CMammal mammal = new CMammal();
        mammal.eat();
        mammal.travel();
    }
}
