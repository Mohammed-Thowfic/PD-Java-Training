class Animal {
    void sound() {
        System.out.println("Animal sound");
    }

}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat is Meow");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sound();
        Animal dog = new Dog();
        dog.sound();
    }
}
