package ConcurrencyJavaAll.Deadlock;

public class Main {
    /**
     deadlock occurs when 2 or more threads are blocked on locks. thread 1 is holding lock 1
    and waiting to acquire lock 2 and thread 2 is holding lock 2 and waiting to acquire lock 1
     Because both of them are holding and not releasing the locks, hence the locks are blocked
     Solution:
     1) Only apply lock on a single object (Though impracticable for many applications that need multiple locks
     2) require that all threads must all try to obtain lock in the same order

     Another reason for deadlock:
        Let's suppose that we have 2 classes that contain synchronised methods , and each class calls a method in the other class.
        When a thread is running an object's synchronized method, no other thread can run a synchronized method using the same object until the first thread exits the method it's runningh
     */

        public static Object lock1 = new Object();
        public static Object lock2 = new Object();

        public static void main(String[] args) {
            new Thread1().start();
            new Thread2().start();

        }

        private static class Thread1 extends Thread {
            public void run() {
                synchronized (lock1) {
                    System.out.println("Thread 1: Has lock1");
                    try {
                        Thread.sleep(100);
                    } catch(InterruptedException e) {

                    }
                    System.out.println("Thread 1: Waiting for lock 2");
                    synchronized (lock2) {
                        System.out.println("Thread 1: Has lock1 and lock2");
                    }
                    System.out.println("Thread 1: Released lock2");
                }
                System.out.println("Thread 1: Released lock1. Exiting...");
            }
        }

        // Deadlock implementation
        private static class Thread2 extends Thread {
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread 2: Has lock2");
                try {
                    Thread.sleep(100);
                } catch(InterruptedException e) {

                }
                System.out.println("Thread 2: Waiting for lock1");
                synchronized (lock1) {
                    System.out.println("Thread 2: Has lock2 and lock1");
                }
                System.out.println("Thread 2: released lock1");
            }
            System.out.println("Thread 2: Released lock2. Exiting...");
        }
    }

      // using this restructured Thread2 class instead of the above would remove/solve the deadlock issue in the Thread2 above as correct locking/releasing order is enforced
    /*
        private static class Thread2 extends Thread {
            public void run() {
                synchronized (lock1) {
                    System.out.println("Thread 2: Has lock1");
                    try {
                        Thread.sleep(100);
                    } catch(InterruptedException e) {

                    }
                    System.out.println("Thread 2: Waiting for lock2");
                    synchronized (lock2) {
                        System.out.println("Thread 2: Has lock1 and lock2");
                    }
                    System.out.println("Thread 2: released lock2");
                }
                System.out.println("Thread 2: Released lock1. Exiting...");
            }
        }
        */
    }








