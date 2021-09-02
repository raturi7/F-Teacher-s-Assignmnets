//2.Write a JAVA program which contains a function cube() such that cube(3) returns 27,
// cube(0.2) returns 0.008.
public class q2 {
    public int cube(int num){
        return num*num*num;
    }
    public double cube(double num){
        return num*num*num;
    }
    public static void main(String[] args) {
        q2 q2=new q2();
        int h=q2.cube(3);
        double j=q2.cube(0.2);
        System.out.printf("the int square of number is %d \n",h);
        System.out.printf("the double square of number is %f",j);
    }
}
