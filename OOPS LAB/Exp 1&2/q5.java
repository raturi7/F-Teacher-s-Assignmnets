import java.util.Scanner;

//5.	Write program, which will find sum of product to consecutive digits. 
//e.g. when the input is 23145 the output is 2x3 + 3x1 + 1x4 + 4x5 = 33
public class q5 {
    public int digi(int num){
        int check=0;
        int result=0;
        while(num!=0){
            for(int i=0;i<1;i++){
                check=(num%100);
                result=result+((check%10)*(check/10));
            }
            num=num/10;
            if(num/10==0){
                break;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        q5 obj=new q5();
        Scanner scanner=new Scanner(System.in);
        int num,result;
        System.out.println("Give your number :");
        num=scanner.nextInt();
        result=obj.digi(num);
        System.out.println("the number sum is : "+result);
        scanner.close();
    }
}
