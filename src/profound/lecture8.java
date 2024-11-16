package profound;
//constructor in java
public class lecture8 {
    double price;
    String color;
    String model;
    int qty;
    // constructor : special method that gets invoked when you create a object.
    //special method
    lecture8(){
        color="black";
        model="basic";
        price=500.0;
        qty=1;

    }

    public static void main(String[] args) {
        lecture8 lp=new lecture8();
        System.out.println(lp.color);
        System.out.println(lp.model);
        System.out.println(lp.qty);
        System.out.println(lp.price);
    }
}
