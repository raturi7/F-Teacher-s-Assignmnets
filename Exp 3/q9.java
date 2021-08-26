//9.	Implement a=b*c as a=Comp.mul(b, c), where a, b and c are objects of class Comp.
class Compi {
    int a;
    int b;
    public void getInt(int b){
        this.b=b;
        
    }
    public int mul(Compi a,Compi b){
        this.a=a.b *b.b;
        return this.a;
    }
}
public class q9 {
    
    public static void main(String[] args) {
        Compi comp=new Compi();
        Compi a=new Compi();
        Compi b=new Compi();
        a.getInt(2);
        b.getInt(3);
        int du=comp.mul(a, b);
        System.out.println(du);
    }
}
