// static keyword in JAVA
/*public class lecture12 {
    static String course;
    int roll;
    static
    {
        System.out.println("inside a static  block");
        course="full stack java";
    }
    lecture12()
    {
        System.out.println("inside a constructor");
    }
    void display()
    {
        System.out.println(course);
    }
    public static void main(String[] args) {
        System.out.println(course);
        // annonymous object
        //new Student1().display();
        lecture12 st =  new lecture12();
        lecture12 st1 =  new lecture12();
        //st.display();
    }
}*/

/*public class lecture12{
    static String cmp_name;
    static int cmpid;
    lecture12()
    {
        System.out.println("I am a  constructor");
    }
    static
    {
        cmp_name="profound edu tech!!!!";
        cmpid=100;
        System.out.println("I  am a static  method");
        System.out.println("I am a static block -1");
    }
    static
    {
        System.out.println(" I am a static  block -2");
    }
    static
    {
        System.out.println("I am static block-3");
    }
    public static void main(String[] args) {
        lecture12 h=new lecture12();
        System.out.println(cmp_name);
        System.out.println(cmpid);
        System.out.println(lecture12.cmp_name);
    }
}*/

/*public class lecture12{
    {
        System.out.println("I AM BLOCK");
    }
    static {
        System.out.println(" a am a static block");
    }
    lecture12(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        lecture12 r=new lecture12();
        lecture12 e=new lecture12();
        lecture12 v=new lecture12();
    }
}*/