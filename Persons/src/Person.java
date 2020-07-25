public class Person {
    String name;
    String designation;

    void learn() {
        System.out.println("I can learn");
    }

    void walk() {
        System.out.println("I can walk");
    }

    void eat() {
        System.out.println("I can eat");
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Singer singer = new Singer();
        Dancer dancer = new Dancer();
        System.out.println("I am a Programmer");
        programmer.learn();
        programmer.eat();
        programmer.walk();
        programmer.coding();
        System.out.println("I am a Singer");
        singer.learn();
        singer.eat();
        singer.walk();
        singer.playGuitar();
        singer.singing();
        System.out.println("I am a Dancer");
        dancer.learn();
        dancer.eat();
        dancer.walk();
        dancer.dancing();
    }

}
