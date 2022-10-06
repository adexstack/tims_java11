package ConcurrencyJavaAll.concurrency;

import static ConcurrencyJavaAll.concurrency.ThreadColor.*;
/*
Note that you invoke a thread using start method (Not run) as using run would invoke the main thread in that class
threadPriority method is mostly dependent on the OS
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        // Creating anonymous class for Thread
        new Thread() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN+"Hello from the anonymous class thread");
            }
        }.start();

        /*
        // Thread from MyRunnable Class
        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();
        */

        // Creating anonymous class for MyRunnable Class
        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
                try {
                    anotherThread.join(); //join is used to start after a thread is completed e.g waiting for data
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again");
                } catch (InterruptedException e){
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        });
        myRunnableThread.start();
        anotherThread.interrupt(); //Added to test the thread interruption

        System.out.println(ANSI_PURPLE+"Hello again from the main thread");
    }
}
