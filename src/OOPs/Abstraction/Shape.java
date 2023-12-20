package OOPs.Abstraction;

abstract class Shape {
    String color;

    //Constructor to set the color
    public Shape(String color) {
        this.color = color;
    }

    //Abstract Method
    abstract double area();

    //Concrete Method
    public String getColor() {
        return color;
    }
}

class Circle extends Shape{
    double radius;
    public Circle(String color, double radius){
        super(color);    //Using super you call the super class constructor
        this.radius = radius;
    }
    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}


