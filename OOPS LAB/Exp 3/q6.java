//6.Write a set of overloaded functions power() that returns the Xn where n is 
//integer and X may be int and float.
import java.lang.Math;
public class q6 {
    public int power(int x,int n){
        double d=(double)x;
        double k=(double)n;
        double res=Math.pow(d,k);
        int rest=(int)res;
        return rest;
    }
    public double power(double x,double y){
        return Math.pow(x, y);
    }
    public static void main(String[] args) {
        q6 q6=new q6();
        int h=q6.power(3,2);
        double j=q6.power(3.5,2);
        
        System.out.printf("the int min return of number is %d \n",h);
        System.out.printf("the float min return of number is %f\n",j);
    }
}
