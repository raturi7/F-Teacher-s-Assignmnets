import java.util.Scanner;

/*
6.	Write program, which reads two number (assume that both have same number of digits).
 The program outputs the sum of product of corresponding digits. Input 327 and 539 output
  3x5+2x3+7x9=84. 
  */
public class q6 {
    public int digi(int num,int num2){
        //int check=0;
        int result=0;
        while(num!=0){
            result=result+((num%10)*(num2%10));
            num=num/10;
            num2=num2/10;

        }
        return result;
    }
    public static void main(String[] args) {
        q6 obj=new q6();
        Scanner scanner=new Scanner(System.in);
        int num,num2,result;
        System.out.println("Give your 1st number :");
        num=scanner.nextInt();
        System.out.println("Give your 2nd number :");
        num2=scanner.nextInt();
        result=obj.digi(num,num2);
        System.out.println("the number sum is : "+result);
        scanner.close();
    }
    }

