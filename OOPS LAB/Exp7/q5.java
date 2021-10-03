/*
5.	You are required to compute the power of a number by implementing a calculator. Create a class Calc 
which consists of a single method long power(int, int). This method takes two integers, a and b, as 
parameters and finds a^b. If either a or  b is negative, then the method must throw an exception which 
says "a and b should not be negative". Also, if both a and b are zero, then the method must throw an 
exception which says "a and b should not be zero"
*/
import java.lang.Math;
import java.util.Scanner;
class Calc {
    public long power(int a, int b){
         long c=0;
         try{
         if(a==0 && b==0){
             throw new Exception("a and b should not be zero");
         }
         if(a<0 || b<0){
            throw new Exception("a and b should not be zero");
         }
         c=(long)Math.pow(a, b);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return c;
    }
    public static void main(String[] args) {
        Calc calc=new Calc();
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        long c;
        c= calc.power(a, b);
        System.out.println(c);
        scanner.close();
    }
}
