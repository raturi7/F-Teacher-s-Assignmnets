interface A{
    void meth1();
    void meth2();
}
class q2 implements A {
    public static void main(String[] args) {
        q2 test=new q2();
        test.meth1();
        test.meth2();
    }
    @Override
    public void meth1(){
        System.out.println("in meth 1");
    }
    @Override
    public void meth2(){
        System.out.println("in meth 2");
    }
}