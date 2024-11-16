package profound;

public class lecture5 {
   /* class Student {
        //member variable
        int roll;
        String name;
        String course;

        //method
        void exam() {
            System.out.println("exam");
        }

        void Attend() {
            System.out.println("lecture");
        }
    }
    public void main(String[] args) {
        //TODD Auto-generate method stub
        Student tina = new Student();
        tina.roll=123;
        tina.course="TEENA  -Y";
        System.out.println(tina.name+"\t"+tina.course+"\t"+tina.roll);
        tina.Attend();
        tina.exam();*/

    //member variable
    class Book{
        int bid;
        String name;
        double price;
        int numberofpages;

        void display(){
            System.out.println(bid+"\t"+price+"\t"+price+"\t"+numberofpages);
        }
    }
        public void main(String[] args) {

        Book java = new Book();
        java.bid=123;
        java.name="complete java";
        java.numberofpages=2000;
        java.price=800;
        java.display();

        Book python = new Book();
        python.bid=124;
        python.name="complete python guide";
        python.numberofpages=600;
        java.price=500;
        java.display();

        Book  python1= new Book();
        python1.bid=125;
        python1.name="complete python guide";
        python1.numberofpages=600;
        java.price=900;
        java.display();
        }
}
