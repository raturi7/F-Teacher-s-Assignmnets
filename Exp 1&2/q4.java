import java.util.Scanner;
//4.Write program to find sum of all digits. Input 23617 output 2+3+6+1+7=19.
public class q4 {
    public int digi(int num){
        int check=0;
        while(num!=0){
            check=check+(num%10);
            num=num/10;
        }
        return check;
    }
    public static void main(String[] args) {
        q4 obj=new q4();
        Scanner scanner=new Scanner(System.in);
        int num,result;
        System.out.println("Give your number :");
        num=scanner.nextInt();
        result=obj.digi(num);
        System.out.println("the number sum is : "+result);
        scanner.close();
    }
}
