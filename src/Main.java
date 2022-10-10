import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) /*throws InterruptedException*/ {
        Stopwatch myWatch = new Stopwatch();
        myWatch.start();
//        TimeUnit.SECONDS.sleep(5);
        for (double i = 0 ; i < 1000000 ; i ++){
            System.out.print("");
        };
        myWatch.stop();
        System.out.print("ket qua: "+ myWatch.getElapsedTime());
    }
}