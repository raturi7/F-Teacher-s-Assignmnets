/*11.	Implement a=b/c as a=b.divide(c), where a, b and c are objects of class Comp.
[Hint: a/b is defined as a*b.conjugate()/b.magnitude2()]
*/

import java.lang.Math;;

class Complex{
    double real,img;

    public Complex(){

    }
    public Complex(double real){
        this.real=real;
    }
    public Complex(double real, double img){
        this.real=real;
        this.img=-1*img;
    }
    

    public void multi_comp( Complex b){
        double c_real,c_img;
        c_real=b.real*this.real;
        c_img=b.img*this.real;
        
        double mag=Math.sqrt((Math.pow(b.real, 2)+(Math.pow(b.img, 2))));
        c_real=c_real/mag;
        c_img=c_img/mag;
        System.out.println("a/b= "+String.valueOf(c_real)+" "+String.valueOf(c_img)+"i");
    }
}

class q11 {
    public static void main(String[] args) {
        Complex b=new Complex(2);
        Complex c=new Complex(2, 1);
     
        b.multi_comp(c);
    }
}
