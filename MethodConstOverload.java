public class MethodConstOverload {
    String name;
    int age;

    public MethodConstOverload() {
        this.name = "Unknown";
        this.age = 0;
    }

    public MethodConstOverload(String name) {
        this.name = name;
        this.age = 0;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void display(String message) {
        System.out.println(message + " Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        MethodConstOverload person1 = new MethodConstOverload();
        MethodConstOverload person2 = new MethodConstOverload("Alice");

        person1.display();
        person2.display("Hello!");
    }
}
