package profound;

public class lecture6 {
    //instance variable
    int pid;
    String pname, rating;
    double price;

    void display() {
        System.out.println("inside a method display");
        System.out.println(pid + "\t" + pname + "\t" + rating + "\t" + price);
    }

    void printdetails() {
        System.out.println("inside a method");
        pid = 100;
        pname = "smart water";
        rating = "5";
        price = 678.90;

        System.out.println(pid + "\t" + pname + "\t" + rating + "\t" + price);
    }

    public static void main(String[] args) {
        //todo auto generation method stub
        lecture6 le = new lecture6();
        le.pid = 123;
        le.pname = "digital camera";
        le.rating = "excellent";
        le.price = 5543.7;
    }
}
    /*void m1() {
        //local
        int x;
        double price;
        String name;
    }
        void Accept(int id, String n, double p){
            System.out.println(id);
            System.out.println(n);
            System.out.println(p);
        }
    public static void main(String[] args) {
        //local variable
        lecture6 le = new lecture6();*/
        /*System.out.println(le.x);
        System.out.println(le.price);
        System.out.println(le.name);

        le.Accept(100,"test",9.0);
        le.name="test1234";
        le.price=9.7;
        le.x=12;

        le.Accept(le.x,le.name,le.price);*/
        //the main difference local and instant variable is that local must be initialized  instance varibles have default value
        //

    //}
//}