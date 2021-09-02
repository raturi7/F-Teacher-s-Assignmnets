/*3.Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Every worker has a name 
and a salary rate. Write method ComPay (int hours) to compute the week pay of every worker. A Daily Worker is paid
 on the basis of the number of days he/she works. The Salaried Worker gets paid the wage for 40 hours a week no 
 matter what the actual hours are. Test this program to calculate the pay of workers. You are expected to use the
  concept of polymorphism to write this program.
*/
class DailyWorker extends worker{
   int salary_rate;
    @Override
    public void ComPay_d(int days){
      this.salary_rate=days-30;
    }
}
class SalariedWorker extends worker{
    int salary_rate;
    @Override
    public void ComPay(int hours){
      int tot_hr=40*4;
      this.salary_rate=hours/tot_hr;
    }
}
public class worker {
    String name;
    int salary_rate;

    public void ComPay(int hours){
      int tot_hr=40*4;
      this.salary_rate=hours/tot_hr;
    }
    public void ComPay_d(int days){
      this.salary_rate=days-30;
    }
}
class demo{
  public static void main(String[] args) {
    SalariedWorker salariedWorker= new SalariedWorker();
    salariedWorker.name="Harshit";
    salariedWorker.ComPay(420);
    System.out.println(salariedWorker.salary_rate);
  }
}