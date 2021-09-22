interface Mathematics{
    int h=10;
    int p=2;
    void div(int a, int b);
    void mod(int a, int b);
}
class q4 implements Mathematics{
    public static void main(String[] args) {
        q4 q4=new q4();
        q4.div(h, p);
        q4.mod(h, p);
    }
    @Override
    public void div(int a,int b){
        System.out.println(a/b);
    }
    @Override
    public void mod(int a,int b){
        System.out.println(a%b);
    }
}
