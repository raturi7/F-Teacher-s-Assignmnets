import java.util.Scanner;

//4.You are given two integers, a and b as input, you have to compute a/b: If a and b are not bit
// signed integers or if is zero, exception will occur and you have to report it.
public class q4 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a / b);
        } catch (Exception e) {

            // e.printStackTrace();
            System.out.println(e);
        }
        scanner.close();
    }
}
