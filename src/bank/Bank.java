package bank;

class Account{
    public String name;
    protected String email;
    private String password;
    private String randomPass;

    //Getter & setters-----to access the file of private class
    public String getPassword(){
        setPassword(randomPass);
        return this.password;
    }
    public boolean setPassword(String pass){
        this.password = pass;
        return false;
    }
}

public class Bank {
    public static void main(String[] args){
        Account account1 = new Account();
        account1.name = "Apna collage";
        account1.email = "Ausufiyan@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
        System.out.println(account1.setPassword("ford"));
    }
}
