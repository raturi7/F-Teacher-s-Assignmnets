/*
import java.util.Scanner;

class student {
    String name; int roll;
    

    public student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }

}

class q1 {
    public static void main(String ar[]) {
        int no = 10;
        int roll;
        String name;
        Scanner in =new Scanner(System.in);
        try {
            System.out.println("enter the number of students : ");
            no = Integer.parseInt(in.nextLine());
            for (int i = 0; i < no; i++){
                System.out.println("enter the name of student : ");
                name=in.nextLine();
                System.out.println("enter the Roll No of student : ");
                roll = Integer.parseInt(in.nextLine());
                new student(name, roll);
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("the maximum students should be ten\n");
            no = 10;
            for (int i = 0; i < no; i++){
                System.out.println("enter the name of student : ");
                name=in.nextLine();
                System.out.println("enter the Roll No of student : ");
                roll = Integer.parseInt(in.nextLine());
                new student(name, roll);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            in.close();
        }
    }
}
*/
import java.util.Scanner;
class Student {
    public static void main(String[] args) {
        int []roll= new int[10];
        String []name=new String[10];
        int left=0;
        int numberOfStudents;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        numberOfStudents=scanner.nextInt();
        try {
            // if (numberOfStudents>10){
            //     throw new Exception(11);
            // }
            for (int i=0;i<numberOfStudents;i++){
                System.out.println("Enter the name of student : ");
                name[i]=scanner.next();
                System.out.println("Enter the Roll no. of student : ");
                roll[i]=scanner.nextInt();
                left=i;
            }
            
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dont put Number more than 10");
            e.printStackTrace();
            System.out.println(left);
            numberOfStudents=10;
            for (int i=0;i<roll.length;i++){   //i=left for resuming from where you left.
                System.out.println("Enter the name of student : ");
                name[i]=scanner.next();
                System.out.println("Enter the Roll no. of student : ");
                roll[i]=scanner.nextInt();
        }
        scanner.close();
        System.out.println("------------------");
        for (int j=0;j<roll.length;j++){
            System.out.println(name[j]);
            System.out.println(roll[j]);
            
        }
        
    }
}
}
