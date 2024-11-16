package profound;

/* {
    int sid;
    String name, course;
    String collage_name;

    void display(){
        System.out.println(sid+":"+name+":"+collage_name+":"+course);
    }
    public static void main(String[] args) {
        lecture11 r=new lecture11();
        r.sid=100;
        r.collage_name="profoundedutech";
        r.course="JAVA";
        r.name="Student1";

        lecture11 o=new lecture11();
        o.sid=99;
        o.name="student2";
        o.course="JAVA";
        o.collage_name="profoundedutech";
    }
}*/

/*public class lecture11{
    int sid;
    String name;
    static String course="fullstack java";
    static	String  college_name="profound edu tech!!!";

    void display()
    {
        System.out.println(sid+""+name+""+course+""+college_name);
    }
    public static void main(String[] args) {
        lecture11 s = new lecture11();
        s.sid=123;
        s.name="student-1";
        s.display();

        lecture11 s1 = new lecture11();
        s1.sid=123;
        s1.name="student-1";
        s1.display();


        lecture11 s3 = new lecture11();
        s3.name="student-11";
        s3.sid=456;
        s3.display();
    }
}*/

/*public class lecture11{
    //instance variables
    int a,b;
    static int x;
    void m1()
    {
        System.out.println("m1 is a non static method ");
        System.out.println("non static  method can access static as well  as non static variables");
        a=100;
        b=200;
        x=300;
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
    }
    static  void m2()
    {
        // it access only  static  variable;
        x=100;
        System.out.println("m2 is a static  method"+x);
    }
    static int Add(int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        lecture11 t =  new lecture11();
        t.m1();
        m2();
        int x=Add(6,7);
        System.out.println(x);
    }
}*/
/*public class Batch {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //System.out.println(Batch.college_name);
        //System.out.println(Batch.course);
        lecture11.m2();
        System.out.println(lecture11.Add(100, 220));

    }

}*/