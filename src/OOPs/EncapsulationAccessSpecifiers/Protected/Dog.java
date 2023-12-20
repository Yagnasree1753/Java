package EncapsulationAccessSpecifiers.Protected;

public class Dog extends Animal{
    public void display(){
        eat();    //Accessing the protected method from animal
    }
}
