package profound;

/*import java.util.Scanner;

public class lecture7 {
    int eid;
    String ename;
    String dept;
    double exp;

    void Accept (int eid, String ename, String dept, double exp)
    {
        this.eid=eid;
        this.ename=ename;
        this.dept=dept;
        this.exp=exp;
    }
    void display(){
        System.out.println(eid+":"+ename+":"+dept+":"+exp);
    }
    public static void main(String[] args) {
        //in java this is a keyword or (reference) that make a difference between local variable and instance variable
        Scanner sc = new Scanner(System.in);
        System.out.println("enter eid, ename, dept, exp");
        int eid=sc.nextInt();
        String ename = sc.next();
        String dept = sc.next();
        double exp= sc.nextDouble();
        lecture7 lr=new lecture7();
        lr.Accept(eid,ename,dept,exp);
        lr.display();
    }
}*/
                                //OR
public class lecture7{
    String name, address;
    int amount;
    String modeofpayment;

    void m1(String name, String address, int amount, String modeofpayment){
        this.name=name;
        this.address=address;
        this.amount=amount;
        this.modeofpayment=modeofpayment;
    }
    public static void main(String[] args) {
        lecture7 le= new lecture7();
        le.m1("customer1", "paud road", 145,"cash");
        System.out.println(le.name);
        System.out.println(le.address);
        System.out.println(le.amount);
        System.out.println(le.modeofpayment);
    }
}

/*public class lecture7{
    double amount = 5000;
    void deposit(int amt){
        this.amount=amount+amt;
    }
    void withdraw(int amt){
        this.amount=amt;
        this.amount=this.amount-amt;
    }
    void totalbalance(){
        System.out.println(amount);
    }
    public static void main(String[] args) {
        lecture7 lo=new lecture7();
        lo.deposit(500);
        System.out.println(lo.amount);

        lo.withdraw(1000);
        lo.totalbalance();

    }
}*/

/*public class lecture7{
    void m1(){
        System.out.println("inside a m1 method");
        //this.n1();
               //or
        n1();
    }
    void n1(){
        System.out.println("hello");
    }
    void test(){
        this.m1();
        this.n1();
    }
    public static void main(String[] args) {
        lecture7 ly = new lecture7();
        ly.m1();
        ly.test();
    }
}*/