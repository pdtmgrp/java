public class PersonClassesObjects {
    String name;

    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public static void main(String[] args) {
        
        PersonClassesObjects person1 = new PersonClassesObjects();

        person1.name = "Name";

        person1.sayHello();
    }
}
