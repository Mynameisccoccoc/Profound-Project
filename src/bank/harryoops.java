package bank;
class Employee{
    int salary;
    int id;
    String name;
    public void printDetails(){
        System.out.println("my id is " +id);
        System.out.println("and my name is " +name);
    }
    public int getSalary(){
        return salary;
    }
}
public class harryoops {
    public static void main(String[] args) {
        Employee harryv = new Employee();
        Employee john = new Employee();
        harryv.id=12;
        harryv.salary=33;
        harryv.name="Abz";
        System.out.println(harryv.id);
        System.out.println(harryv.name);
        harryv.printDetails();
        john.id=17;
        john.salary=66;
        john.name="rain";
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}
