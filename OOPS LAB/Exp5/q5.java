/*5.Write program to create an interface StackInterface having methods push (), pop () and display (). StackClass implements StackInterface.
 Class StackClass contains the main method which is having a switch case for selecting the particular operation of the stack.
 */

interface StackInterface{
    int []arr=new int[3];
    
    public void push(int a);
    public void pop();
    public void display();

}
class StackClass implements StackInterface {
    int top=-1;
    @Override
        public void push(int a){
            if (top >= (arr.length- 1)) {
                System.out.println("Stack Overflow");
            }
            else {
                arr[++top] = a;
                System.out.println(a + " pushed into stack");
            }
        }
        @Override
        public void pop(){
            if (top < 0) {
                System.out.println("Stack Underflow");
                
            }
            else {
                arr[top--]=0;
                
            }
        }
        @Override
        public void display(){
            for(int i=0;i<arr.length;i++){
                System.out.println( arr[i]);
            }
        }
    public static void main(String[] args) {
        StackClass stackClass=new StackClass();
        stackClass.push(10);
        // stackClass.display();
        stackClass.push(20);
        stackClass.display();
        stackClass.pop();
        stackClass.display();
    }    
}
