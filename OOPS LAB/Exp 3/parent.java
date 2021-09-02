 class parent {
    public void sum(){
        System.out.println("hello");
    }
}
 class Child extends parent{
    public void hum(){
        System.out.println("its child");
    }
}

class demo{
    public static void main(String[] args) {
        parent parent=new parent();
        parent= new Child();
        parent=(Child) Child();
        parent.hum();
    }
}