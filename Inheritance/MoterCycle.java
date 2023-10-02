
class Cycle{

    int  wheel=2;
    int speed=30;
    void setSpeed()
    {
        System.out.println("Speed of cycle " + speed);
    }
}

class MoterCycle extends Cycle{

    int speed=120;
    void setSpeed()
    {
       
        System.out.println("Speed of MoterCycle is " + speed);
    }

    public static void main(String[] args)
    {
        MoterCycle m1 = new MoterCycle();

        m1.setSpeed();
        super.m1.setSpeed();
    }
}
