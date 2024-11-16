package profound;
// abstract means a class which id declared by the abstract and cintains the abstract method
//abstract method means methods which are only declared and not define
//we cannot creater the object of abstract class because it is an incomplete class
//but we can creqate the reference variable of abstract class on which we can store the reference of child class object
//when we inherate new class from abstract class then all abstract method of abstract class compulsary we have to over write in sub class
//abstract class is used to achieve a dynamic linking or a dynamic polymorphisc
/*public abstract class lecture15 {
    public abstract void display();

    public static void main(String[] args) {

    }
}
public class Sony extends PC{
    public void dislay(){
        System.out.println("display HP data");
    }
}

public class lecture extends PC{
    Scanner sc=new Scanner(System.in);
    PC p1;
    int ch;
System.out.println("\n1]Sony\n2]HP\n3]Dell\nEnter u r choice");
    ch=sc.nextInt();
	switch(ch)
    {
        case 1:
            p1=new Sony();
            p1.display();
            break;
        case 2:
            p1=new HP();
            p1.display();
            break;
        case 3:
            p1=new Dell();
            p1.display();
    }
}
}
} */

//write a abstract class shape with abstract method cal area and inherit two class circle and rectangle from shift class
public abstract class lecture15{
    float area;
    public abstract void calarea();
    public void display(){

    }
    public static void main(String[] args) {

    }
}

//interfac we can inplement in the class then all the method of interfave we can inplement in the class compulasor we have to wver write in the inplement d class
//we cant create the object of interface but we can create reference vriable of interface in which we can store the reference of implement class object
//interfaces are mostly udes to implementer something forcefully in the class we cna implements more then one interface in the class using that we cna achieve multiple inheritance in java bu that is not a multiple inheritance because interface is not a class
