package EncapsulationAccessSpecifiers.PublicPrivate;

public class Main {
    public static void main(String[] args){
        LibraryItem Item = new LibraryItem();

        //Accessible
        System.out.println(Item.publicTitle);
        Item.publicMethod();

        //Not Accessible
        //Accessible
//        System.out.println(Item.privateTitle);
//        Item.privateMethod();
    }
}
