package playgroundddd.stuff;

public abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Concrete method (has a body)
    public void eat() {
        System.out.println("The animal eats.");
    }
}
