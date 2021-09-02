public class point 
{ 
    private float x,y;
  
    public void getPoint(float a,float b){
        x=a;
        y=b;
    }
  public void print() 
  {
   System.out.println("("+x+","+y+")");
  }
  public void abc() {
      x=2*x;
      y=3*y;
    }
  public static point pqr(point a) 
  { point t;
    t=new point();
    t.getPoint(2*a.x,2*a.y);
    return t;
  }
  public void fa(int x,int y){
    x=x+y;
    System.out.println("("+x+","+2*y+")");
}
public void fb(int x,int y){
  y=x+y;
  System.out.println("("+2*x+","+y+")");
}
public void fc(int x,int y){
  int c,d;
  c=x+y;
  d=x*y;
  System.out.println("("+c+","+d+")");
}
  public void ghi(point a) 
  {  
      x=2*a.x;
      y=3*a.y;
      }
  public float getx()
  {  
      return x;
       }

       public static void main(String[] args) {
           point point=new point();
           point.getPoint(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
           point.print();
           point.abc();
           point.print();
           pqr(point);

           point.fa(20, 4);
           //point.print();
           point.fb(20, 4);
           point.fc(20, 4);
       }

}
