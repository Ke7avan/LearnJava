//method overriding (runtime polymorphism)
class Animal {
    void sound() {
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("The cat meows");
    }
}
//method overloading (compile-time polymorphism)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
    double add(int a, double b) {
        return a + b;
    }
}
//main function
public class Polymorphism {
    public static void main(String[] args) {
        //method overriding (runtime polymorphism)
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();
        //method overloading (compile-time polymorphism)
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(10, 20));
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));
        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.5));
        System.out.println("Sum of an integer and a double: " + calc.add(10, 20.5));

    }
}