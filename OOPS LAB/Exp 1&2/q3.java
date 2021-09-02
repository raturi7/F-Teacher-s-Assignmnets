import java.util.Scanner;

public class q3 {

    public int digi(int num){
        int check=0;
        while(num!=0){
            num=num/10;
            if(num/100==0){
                check=num%10;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args){
        q3 obj=new q3();
        
        Scanner scanner=new Scanner(System.in);
        int num,result;
        System.out.println("Give your number :");
        num=scanner.nextInt();
        result=obj.digi(num);
        System.out.println("the number at 2nd place is : "+result);
        scanner.close();
    }
}
