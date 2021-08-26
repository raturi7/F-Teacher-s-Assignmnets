/*import java.lang.*;
class Comp{ 
    float real,img;
    public void getComp(float a,float b){
         real=a;
         img=b; 
    }

   public void print1() 
   { 
   System.out.println(real+"+"+img+"i");
   }

   public void duble() 
   { real=2*real;
     img=2*img;
     }
   public void ktimes(int k)   
   {  real=k*real;
    img=k*img;
 }
   private float magsq()
   {
        return real*real+img*img;
}
   public float magnitude()
   { float t;
     t=(float)Math.sqrt(this.magsq());  
     return(t);
   }
   public void add(Comp x)
   { real=real+x.real;
    img=img+x.img;
 }
   public void add(Comp x,Comp y)
   { 
     real=x.real+y.real;
     img=x.img+y.img; 
   }
   public Comp add3(Comp x)
   { Comp c;
    float a,b;
     c=new Comp();
     a=real+x.real;
     b=img+x.img;
     c.getComp(a,b);
     return(c); 
   }
   public float getreal() 
   {
        return(real);
 } 
   private float getimaginary() 
   {
        return(img);
    } 
}
class hari
{public static void main( String args[])
 { Comp t,s,r,m;
    float j;
   t=new Comp();
   s=new Comp();
   r=new Comp();
   t.getComp(4,2);
   t.duble();
   t.print1();
   t.getComp(4,2);
   t.ktimes(10);
   t.print1();
   t.getComp(4,3);
   j=t.magnitude();
   System.out.println(j);
   s.getComp(2,7);
   t.getComp(4,2);
   s.add(t);
   s.print1();
   s.getComp(2,7);
   t.getComp(4,3);
   r.add(s,t);
   r.print1();
   s.getComp(2,7);
   t.getComp(4,23);
   r=s.add3(t);
   r.print1();
   System.out.println(s.getreal());
 }
}
*/