import java.util.Scanner;

public class q1{

    public int digi(int num,int k){
        for(int i=0;i<k-1;i++){
            num=num/10;
        }
        return num%10;
    }

     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        q1 obj=new q1();
        int num,k,result;
        System.out.println("Enter the number :");
        num=scanner.nextInt();
        System.out.println("Enter the place :");
        k=scanner.nextInt();
        result=obj.digi(num, k);
        System.out.println("The value at place is :"+result); 
        scanner.close();
    }
}