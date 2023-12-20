package Class_Objects;
public class car {
    //Fields
    String color;
    String brand;

    //Constructor
    public car(String color, String brand){
        this.color = color;
        this.brand = brand;
    }

    //Method
    public void displayInfo(){
        System.out.println("Car brand: " + brand + "Car color: " + color);
    }
}
