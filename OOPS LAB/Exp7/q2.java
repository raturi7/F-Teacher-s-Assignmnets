class MyException extends Exception {
    public MyException(String S) {
        super(S);
    }
}

public class q2 {
    public static void main(String[] args) {
        try {
            char t = args[1].charAt(0);
            if (!(Character.isDigit(t)))
                throw new MyException(" Not an Integer");

            int x = Integer.parseInt(args[0]);
            // int y= Integer.
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

}