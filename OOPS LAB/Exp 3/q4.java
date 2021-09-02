//4.Write a JAVA program which contains a function fun() such that fun(x) returns x 
//and fun(x,y) returns x + y and fun(x,y,z) returns x*y*z. (where x, y and z are integers).
public class q4 {
    public int fun(int x){
        return x;
    }
    public int fun(int x,int y){
        return (x+y);
    }
    public int fun(int x,int y,int z){
        return x*y*z;
    }
    public static void main(String[] args) {
        q4 q4=new q4();
        int h=q4.fun(3);
        int j=q4.fun(3,4);
        int i=q4.fun(3,4,5);
        System.out.printf("the int simple return of number is %d \n",h);
        System.out.printf("the int square return of number is %d\n",j);
        System.out.printf("the int product of numbers is %d \n",i);
    }
}
