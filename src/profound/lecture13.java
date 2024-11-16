package profound;

class lecture12{
    lecture12(){
        System.out.println("constructor");
    }
    lecture12(int a){
        System.out.println("parameterixed"+a);
    }
    static {
        System.out.println("static block");
    }
    {
        System.out.println("block1");
    }
    {
        System.out.println("block2");
    }
    public static void main(String[] args) {
        lecture12 q=new lecture12(100);
        lecture12 w=new lecture12();
    }
}