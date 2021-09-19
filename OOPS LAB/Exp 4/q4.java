//4.Consider the trunk calls of a telephone exchange. A trunk call can be ordinary,
// urgent or lightning. The charges depend on the duration and the type of the call.
// Write a program using the concept of polymorphism in Java to calculate the charges.

public class q4 {
    public static void main(String[] args)
    {
        bill b1 = new bill(800, "urgent");         b1.show();
    }
}
class call
{
    int duration;
    String type;

    call(int dur, String type)
    {
        duration = dur;         this.type = type;
    }
    void show()
    {
        System.out.print("\nDuration(in seconds): "+duration);
        System.out.print("\nType: "+type);
    }
}
class bill extends call {
    float amount;
    float rate;

    bill(int dur, String t) {
        super(dur, t);
        if (t == "urgent") {
            rate = 4;
        } else if (t == "lightning") {
            rate = 5;
        } else {
            rate = 1;
        }
        amount = (duration * rate) / 100;
    }

    void show() {
        super.show();
        System.out.print("\nRate(paise/sec): " + rate);
        System.out.print("\nTotal charges(in Rs.): " + amount);
    }
}

