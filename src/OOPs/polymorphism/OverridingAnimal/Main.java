package polymorphism.OverridingAnimal;

class Animal {
    public void makeSound(){
        System.out.println("Generic Animal Sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Wooof!");
    }
}
public class Main{
    public static void main(String[] args){
        Animal myAnimal = new Animal(); //Animal reference Animal object
        Animal myDog = new Dog(); //Animal reference but Dog object
        myAnimal.makeSound();
        myDog.makeSound();
    }
}
