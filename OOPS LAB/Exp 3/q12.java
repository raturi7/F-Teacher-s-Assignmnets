// 12.	Implement a=b/c as a=Comp.divide(b, c), where a, b and c are objects of class Comp.
// [Hint: a/b is defined as a*b.conjugate()/b.magnitude2()]

import java.lang.Math;;

class Complex_Comp{
    double real,img;

    public Complex_Comp(){

    }
    public Complex_Comp(double real){
        this.real=real;
    }
    public Complex_Comp(double real, double img){
        this.real=real;
        this.img=-1*img;
    }
    

    public void divide(Complex_Comp a, Complex_Comp b){
        double c_real,c_img;
        c_real=b.real*a.real;
        c_img=b.img*a.real;
        
        double mag=Math.sqrt((Math.pow(b.real, 2)+(Math.pow(b.img, 2))));
        c_real=c_real/mag;
        c_img=c_img/mag;
        System.out.println("a/b= "+String.valueOf(c_real)+" "+String.valueOf(c_img)+"i");
    }
}
class q12 {
    public static void main(String[] args) {
        Complex_Comp a=new Complex_Comp(2);
        Complex_Comp b=new Complex_Comp(2, 1);
        Complex_Comp c= new Complex_Comp();
        c.divide(a, b);
    }
}
