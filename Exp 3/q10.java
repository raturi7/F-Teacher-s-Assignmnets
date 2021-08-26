//10.	Define Comp conjugate()  
//e.g.      conjugate(2+3i) is 2-3i
class Compo{
    public String conjugate(String s){
        String str1=s;

        if (s.indexOf("-") != -1){
            str1=str1.replace("-", "+");
            return str1;
        }else if(s.indexOf("+") != -1){
            str1=str1.replace("+", "-");
            return str1;
        }else{
            System.out.println("Give right input");
            return null;
        }
        
    }
}
public class q10 {
    public static void main(String[] args) {
        Compo c=new Compo();
        String str="2+3i";
        String res=c.conjugate(str);
        System.out.println(res);
    }
}
