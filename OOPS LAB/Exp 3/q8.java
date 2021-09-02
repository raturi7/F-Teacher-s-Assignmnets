//8.Implement a=a*b as a.mul(b), where a and b are objects of class Comp.
class Comp{
int a;
    public void getint(int a){
        this.a=a;
    }
    public int mul(Comp c){
        int res=this.a*c.a;
        return res;
    }
}
public class q8 {
    public static void main(String[] args) {
        Comp a=new Comp();
        Comp b= new Comp();
        b.getint(2);
        a.getint(3);
        int res=a.mul(b);
        System.out.println(res);
        
    }
}
