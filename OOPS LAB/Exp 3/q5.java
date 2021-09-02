//5.Write a set of overloaded functions min() that returns the smaller of two numbers
// passed to them as arguments. Make versions for int and float.
public class q5 {
    public int min(int x,int y){
        int temp;
        temp=x<y?x:y;
        return temp;
    }
    public float min(float x,float y){
        float temp;
        temp=x<y?x:y;
        return temp;
    }
    public static void main(String[] args) {
        q5 q5=new q5();
        int h=q5.min(3,4);
        float j=q5.min(3.5f,4.6f);
        
        System.out.printf("the int min return of number is %d \n",h);
        System.out.printf("the float min return of number is %f\n",j);
    }
    
}
