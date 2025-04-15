//Superclass
class Animal {
    public void eat() {
        System.out.println("Animal is eating");

    }
    public void makeSound() {
        System.out.println("Animal is making sound");
    }
}
// Subclass inheriting from Animal
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
        System.out.println("Animal also make sound");
    }
}


