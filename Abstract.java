abstract class Animal {
    public abstract void sound();
    
    public void sleep() {
        System.out.println("The animal is sleeping");
    }
}

class Dog extends Animal {

    public void sound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    
    public void sound() {
        System.out.println("The cat makes sound like meow");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();
        myDog.sleep();
        myCat.sleep();
    }
}


