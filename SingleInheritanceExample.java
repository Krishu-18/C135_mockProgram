class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
     
        Dog myDog = new Dog();
        myDog.eat();  // Inherited from Animal class
        myDog.bark(); // Specific to Dog class
    }
}

 
