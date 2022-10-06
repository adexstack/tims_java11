package ConcurrencyJavaAll.ThreadVariableSynchronize;

        /**
         Synchrorized - Only one thread at a time (Prevent thread interference)

         To prevent race condition:
         1. To synchronize the method
         2. Synchronize the block of statement rather than the method. Every java object has an intrinsic lock (monitor)

         Do not use local variable to synchronize (Only Exception is String)
         Synchronization don't work on primitive data types (Done on objects)
         Critical sections
         Thread safe (Developer has implemented synchronisation on the critical sections of the code )
         Only syncronise only the code that should be synchronised (At the barest minimum)

         */
public class Main {
    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class Countdown {

    private int i;

    public void doCountdown() {
        String color;

        switch(Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }

        /**
        Creating "synchronized(this){" and pasting the for loop inside it introduced synchronization
        on Countdown class object and as such enforces that each thread run without interference
         Remove "synchronized(this){" to see the default multi threading interference behaviour
        */

        synchronized(this){
            for(i=10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
            }
        }

    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}

