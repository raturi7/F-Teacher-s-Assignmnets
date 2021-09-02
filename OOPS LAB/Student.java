class Student{
    public String name;
    public String city;
    public double cgpa;

}
class Demomain{
    public static void main(String[] args) {
        Student amit=new Student();
        amit.name="Amit Kumar";
        amit.city="Kanpur";
        amit.cgpa=7.65;
        System.out.println("name : "+amit.name);


    }
}