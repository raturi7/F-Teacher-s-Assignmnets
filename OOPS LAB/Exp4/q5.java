class q5 {
    
}
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
        a.salary=a.salary+((incrementPerc/100)*a.salary);
    } 
}
class Manager extends Employee{
    public static void main(String[] args) {
        Manager manager=new Manager();
        Employee employee=new Employee();
        employee.empid=1001;
        employee.name="tihsrah";
        employee.salary=20;
        String test="";
        test=manager.employeeDetails(employee);
        System.out.println(test);
        manager.increaseSalary(employee,10);
        test=manager.employeeDetails(employee);
        System.out.println(test);
    }

}