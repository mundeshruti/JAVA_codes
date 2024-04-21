package OOPs.Abstract_Class;

public class Test {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.makeSound();
        c.sleep();

        Animal d = new Dog();
        d.makeSound();
    }
}
