//3.Write a JAVA program which contains a function fun() such that fun(x) returns x2
// and fun(x,y) returns x2 + y2. (where x and y are integers).
//import java.lang.Math;
public class q3 {
    public int fun(int x){
        return x*x;
    }
    public int fun(int x,int y){
        return (x*x)+(y*y);
    }
    public static void main(String[] args) {
        q3 q3=new q3();
        int h=q3.fun(3);
        int j=q3.fun(3,4);
        System.out.printf("the int x^2 of number is %d \n",h);
        System.out.printf("the int x^2+y^2 of number is %d",j);
    }
}
