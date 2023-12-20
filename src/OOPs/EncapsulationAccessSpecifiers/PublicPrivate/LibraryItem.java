package EncapsulationAccessSpecifiers.PublicPrivate;

public class LibraryItem {
    private String privateTitle;    //Only Accessible within Library Items
    public String publicTitle;      //Accessible from any class

    public LibraryItem(){
        privateTitle = "privateBook";
        publicTitle = "publicBook";
    }
    private void privateMethod(){
        System.out.println("Private Method: " + privateTitle);
    }
    public void publicMethod(){
        System.out.println("public Method: "+ publicTitle);
    }

}
