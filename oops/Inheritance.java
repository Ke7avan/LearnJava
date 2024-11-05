class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
class Cat extends Dog {
    void sound() {
        System.out.println("The cat meows.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.bark();
        cat.sound();
    }
}