//7.Write a set of overloaded functions max() that returns the biggest of two 
//numbers passed to them as arguments. Make versions for int and float.
public class q7 {
    public int max(int x,int y){
        int temp;
        temp=x>y?x:y;
        return temp;
    }
    public float max(float x,float y){
        float temp;
        temp=x>y?x:y;
        return temp;
    }

    public static void main(String[] args) {
        q7 q7=new q7();
        int h=q7.max(3,4);
        float j=q7.max(3.5f,4.6f);
        
        System.out.printf("the int max return of number is %d \n",h);
        System.out.printf("the float max return of number is %f\n",j);
    }
}
