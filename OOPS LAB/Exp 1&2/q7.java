import java.util.Scanner;
import java.lang.Math;

//7.	Write program to print positional values of digits. Input 21463 output
// 3, 60, 400, 1000 and 20000
public class q7 {
    public void digi(int num){
        int check=0;
        double counter=0;
        while(num!=0){
            check= (num%10*((int)Math.pow(10,counter)));
            System.out.println(check);
            num=num/10;
            counter++;
        }
        
    }
    public static void main(String[] args) {
        q7 obj=new q7();
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("Give your number :");
        num=scanner.nextInt();
        obj.digi(num);
        //System.out.println("the number sum is : "+result);
        scanner.close();
    }
}
 
