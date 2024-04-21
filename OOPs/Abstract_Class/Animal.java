package OOPs.Abstract_Class;

public abstract class Animal {
    // Abstract method (method without body)
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println("Zzz");
    }
}
