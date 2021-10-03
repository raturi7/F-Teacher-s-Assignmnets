package q;
import p.*;
public class B extends A {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        b.pro();
        b.pub();
        System.out.println("Others cant be accessed.");
    }
}
