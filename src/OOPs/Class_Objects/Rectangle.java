package Class_Objects;
public class Rectangle {
    //Fields
    int length;
    int width;


    //Constructor
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    //Method
    public void calculateArea(){

        System.out.println("Area of Rectangle " + (length*width));
    }
}
