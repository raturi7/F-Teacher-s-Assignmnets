/*
1.	Write a JAVA program which contains a function square() such that square(3) returns 9,
 square(0.2) returns 0.04.
 */
public class q1 {
    public int square(int num){
        return num*num;
    }
    public double square(double num){
        return num*num;
    }
    public static void main(String[] args) {
        q1 q1=new q1();
        int h=q1.square(3);
        double j=q1.square(0.2);
        System.out.printf("the int square of number is %d \n",h);
        System.out.printf("the double square of number is %f",j);

    }
}
