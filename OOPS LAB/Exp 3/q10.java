//10.	Define Comp conjugate()  
//e.g.      conjugate(2+3i) is 2-3i
class Compo{
    int real,img;
    public Compo(int real, int img){
        this.real=real;
        this.img=-1*img;
    }
    public void prink(){
        System.out.println("Conjugate is = "+String.valueOf(real)+" "+String.valueOf(img)+"i");
    }
    
}
public class q10 {
    public static void main(String[] args) {
        Compo c=new Compo(2,3);
        c.prink();
    }
}
