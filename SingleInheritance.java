class Animal {
    void eat(String animal) {
        System.out.println("The " + animal + " is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat("dog");
        dog.bark();
    }
}