import java.net.SocketPermission;
class FirstThreadsProgram extends Thread{

   public void run()
    {
        int x=10,y=20;

        System.out.println("Sum of xy is = "+(x+y));

    }

    public static void main(String[] args) {
        FirstThreadsProgram t1 = new FirstThreadsProgram();

        t1.start();
    }

}