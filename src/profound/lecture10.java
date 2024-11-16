package profound;
//jvm  will  create default one for
//if there is no constructor
//if constructor is created then
//jvm won't create  a constructor
/*public class lecture10 {
    lecture10()
    {

    }
    lecture10(int id){
        System.out.println("i am a parameterized constructor");
    }
    public static void main(String[] args) {
        lecture10 d=new lecture10(123);
        lecture10 f=new lecture10();
    }
}*/

/*public class lecture10{
    int sid;
    String name, course;
    lecture10(){
        sid=100;
        name="student1";
        course="java";
    }
    lecture10(int sid, String name, String course){
        this.sid=sid;
        this.name=name;
        this.course=course;
    }
    public void display(){
        System.out.println(sid+":"+name+":"+course);
    }
    //to convert object into string toString
    //toString  : that is used to convert object into string
    public String toString(){
        return sid+":"+name+":"+course;
    }
    public static void main(String[] args) {
        lecture10 h=new lecture10(101,"student","fullstack java");
        System.out.println(h);

        h.display();

        lecture10  y=new lecture10(45,"student-1","angular");
        System.out.println(y);

        //Calling using array

        lecture10[] stp=new lecture10[3];
        stp[0]=new lecture10(1,"student1","java");
        stp[1]=new lecture10(2,"student2","jdvc");
        stp[2]=new lecture10(3,"student3","jafr");

        System.out.println(stp[0]);
        System.out.println(stp[1]);
        System.out.println(stp[2]);


    }
}*/

public class lecture10{
    int uid;
    String uname, pass, email;
    lecture10(){
        System.out.println("default");
    }
    lecture10(int uid){
        this.uid=uid;
        System.out.println(uid);
    }
    lecture10(int uid, String uname, String pass){
        this.uid=uid;
        this.uname=uname;
        this.pass=pass;
        System.out.println(uid+":"+uname+":"+pass);
    }
    lecture10(int uid, String uname, String pass, String email){
        this.uid=uid;
        this.uname=uname;
        this.pass=pass;
        this.email=email;
        System.out.println(uid+":"+uname+":"+pass+":"+email);
    }
    public String toString(){
        return uid+";"+uname+":"+pass+":"+email;
    }
    public static void main(String[] args) {
        lecture10 u=new lecture10();
        lecture10 tor=new lecture10(111);
        lecture10 rt=new lecture10(111,"tor","123");
        lecture10 r=new lecture10(111,"tor","123","abusuf@123");

    }
}
