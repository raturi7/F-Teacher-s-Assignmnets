interface Test{
    int num=10;
    public void square(int a);
}

class ToTestInt implements Test{
    public static void main(String[] args) {
        System.out.println(num);
        ToTestInt test=new ToTestInt();
        test.square(num);
    }
    @Override
    public void square(int a){
        System.out.println(a*a);
    }
}