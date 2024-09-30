package JavaPolymorphism;

//polymorphism allows an object to take multiple forms.
//it can be achieved through method overloading( compile-time-polymorphism)
// or method overriding (runtime polymorphism)

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Runtime polymorphism
        animal.sound();
    }
}

