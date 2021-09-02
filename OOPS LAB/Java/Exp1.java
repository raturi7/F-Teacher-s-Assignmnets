import java.util.Scanner;
public class Exp1{
    public static void main (String[] args){
        int num,k;
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Give number =");
        num=scanner.nextInt();
        System.out.println(" Give position =");
        k=scanner.nextInt();
        for(int i=0;i<=k-1;i++){
            num=num/10;
        }
        System.out.println("Your Kth number is : "+String.valueOf(num));
        scanner.close();
    }
}