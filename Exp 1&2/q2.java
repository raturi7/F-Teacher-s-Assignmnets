import java.util.Scanner;
public class q2 {

    public int digit(int num){
        int div,mod;
        div=num;
        mod=num;
        while(div!=0){
            div=div/10;
            if(div==0){
            break;
            }
            mod=div%10;
        }
        return mod;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        q2 obj=new q2();
        int num,result;
        System.out.println("Enter the number :");
        num=scanner.nextInt();
        
        result=obj.digit(num);
        System.out.println("The value at 1st place is :"+result);
        scanner.close();
    }
}
