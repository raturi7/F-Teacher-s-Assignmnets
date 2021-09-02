//2.	Write a program in Java to create a Player class. Inherit the classes Cricket _Player,
// Football _Player and Hockey_ Player from Player class. 
class Cricket_Player{
    public void prin1(){
        System.out.println("Hello i am cricket player.");
    }
}
class Football_Player extends Cricket_Player{
    public void prin2(){
        System.out.println("Hello i am football player. ");
    }
}
class Hockey_Player extends Football_Player{
    public void prin3(){
        System.out.println("Hello i am hockey player.");
    }
}
class player extends Hockey_Player {
    public void prin4(){
        System.out.println("Hello i am player.");
    }
    public static void main(String[] args) {
        player player=new player();
        player.prin1();
        player.prin2();
        player.prin3();
        player.prin4();
    }
}
