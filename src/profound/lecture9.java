package profound;

/*public class lecture9 {
    int n1,n2,n3;
    boolean res;
    lecture9(){
        n1=100;
        n2=200;
        n3=0;
        res=true;
        System.out.println("I am a constructor");
    }
    void sum(){
        n3=n1+n2;
        System.out.println(n3);
    }
    void m1(){
        System.out.println("inside a m1 method");
    }
    public static void main(String[] args) {
        //constructor have a return type
        //must  have a return type
        //must be called using object
        //behaviour
        //
        //constructor
        //do not have a return type
        //will invoked autometically
        //used to initialize instance variable
        lecture9 kk = new lecture9();
        kk.m1();
        System.out.println(kk.n1);
        System.out.println(kk.n2);
        System.out.println(kk.res);
        lecture9 li = new lecture9();
        li.m1();
        kk.sum();

        lecture9 ki= new lecture9();

    }
}*/

public class lecture9{
    lecture9(){
        System.out.println("default one");
    }
    lecture9(int eid){
        System.out.println("parameterixed constructor");
        System.out.println(eid);
    }
    lecture9(int eid, String dept){
        System.out.println("constructor with two diff parameter");
        System.out.println(eid);
        System.out.println(dept);
    }
    lecture9(int eid, String dept, int exp, String skill){
        System.out.println("const with 4 diff para");
        System.out.println(eid);
        System.out.println(dept);
        System.out.println(exp);
        System.out.println(skill);
    }
    public static void main(String[] args) {
        lecture9 hh=new lecture9();
        lecture9 h1=new lecture9(100);
        lecture9 h2=new lecture9(100,"emp1");
                   //OR
        lecture9 w=new lecture9(1,"emp1");
        lecture9 rw=new lecture9(7,"emp5",88,"torn");
    }
}
