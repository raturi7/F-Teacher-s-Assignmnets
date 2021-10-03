import java.util.Scanner;

//3.	Write a code to create your own exception class. Create another class, inside main method 
//prompt user to enter a number if number is less than 500 throw instances of your custom exception class.
class LowException extends Exception {
    public LowException(String s) {
        super(s);
    }
}

public class q3 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Input value : ");
            num = scanner.nextInt();
            if (num < 500) {
                scanner.close();
                throw new LowException("Input number is less than 500");
            }
        } catch (LowException e) {

            e.printStackTrace();
            System.out.println("putting default values : 501 into num");
            num = 501;
        }
        scanner.close();
    }
}
