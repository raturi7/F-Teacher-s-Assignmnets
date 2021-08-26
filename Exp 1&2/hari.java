class hari
{
 public static void main(String args[])
 {   point a,b,c;float t;
     a=new point();
     a.getPoint(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
     a.print();
     a.abc();
     a.print();
     b=point.pqr(a);
     b.print();
     a=new point();
     a.getPoint(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
     c=new point();
     c.ghi(a);
     c.print();
     t=a.getx();System.out.println(t);
  }
}
