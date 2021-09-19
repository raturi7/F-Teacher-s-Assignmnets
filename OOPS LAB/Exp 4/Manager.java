
class Employee{
    String name;
    int empid;
    int salary;
    Employee(){

    }
    Employee(String name,int empid,int salary){
        this.name=name;
        this.empid=empid;
        this.salary=salary;
    }
    public String employeeDetails(Employee a){
        return a.name+" "+String.valueOf(a.salary);
    }
    public void increaseSalary(Employee a,int incrementPerc){
        // int sal=a.salary;
        int sal=(a.salary/100)*incrementPerc;
         a.salary=sal;
    } 
}
class Manager extends Employee{
    public static void main(String[] args) {
        Manager manager=new Manager();
        Employee employee=new Employee();
        employee.empid=1001;
        employee.name="tihsrah";
        employee.salary=2000;
        String test="";
        test=manager.employeeDetails(employee);
        System.out.println(test);
        manager.increaseSalary(employee,10);
        String test2="";
        test2=manager.employeeDetails(employee);
        System.out.println(test2);
    }

}