//1.	Write a Java program to show that private member of a super class
// cannot be accessed from derived classes. 

class parent{
    private int x=10;
    private void prin(){
        System.out.println("It's a private method");
    }
    public void print_check(){
        System.out.println("It's a public method");
    }
}
class child extends parent{
    public void check(){
        print_check();
        
    }
public static void main(String[] args) {
    child child=new child();
    child.check();
    
}
}
