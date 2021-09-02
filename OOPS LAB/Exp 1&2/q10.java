//10.Define fa. If point p is (x,y) then p.fa() will make it (x+y,2y). (20,4) (24,8)
import java.util.Scanner;
public class q10 {
    public void fa(int x,int y){
        x=x+y;
        System.out.println("("+x+","+2*y+")");
    }
    public static void main(String[] args) {
        q10 q10=new q10();
        Scanner scanner=new Scanner(System.in);
        int x,y;
        System.out.println("Enter 1st number x :");
        x=scanner.nextInt();
        System.out.println("Enter 2nd number y :");
        y=scanner.nextInt();
        q10.fa(x, y);
        scanner.close();
    }
}
