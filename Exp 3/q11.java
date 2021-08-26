//11.	Implement a=b/c as a=b.divide(c), where a, b and c are objects of class Comp.
//[Hint: a/b is defined as a*b.conjugate()/b.magnitude^2()]
class Compop{
    public String conjugate(String s){
        String[] str1;

        if (s.indexOf("-") != -1){
            str1=s.split("-");
            return s;
        }else if(s.indexOf("+") != -1){
            //str1=str1.replace("+", "-");
            return s;
        }else{
            System.out.println("Give right input");
            return null;
        }
        for(int i=0;i<str1.length;i++){
            System.out.println(str1[i]);
        }
        
    }
}
public class q11 {
    
}
