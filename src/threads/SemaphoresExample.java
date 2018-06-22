package threads;

import java.util.concurrent.Semaphore;

public class SemaphoresExample {

    static Semaphore semaphore = new Semaphore(3, true);

    static class SemaPhoreThread extends Thread {
        String threadName = "";

        /**
         * Constructor Thread
         *
         * @param threadName
         */
        SemaPhoreThread(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            try {
                System.out.println(threadName + " thread acquiring Lock...");
                System.out.println(
                        threadName + ": in threads available Semaphore permits now : "
                                + semaphore.availablePermits());
                semaphore.acquire();
                System.out.println("Semaphore permitted Thread : " + threadName);
                try {
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(threadName + " : is performing operation " + i
                                + ", available Semaphore permittable threads : "
                                + semaphore.availablePermits());
                        // Thread sleeps for 1 second
                        Thread.sleep(1000);
                    }
                } finally {
                    System.out.println(threadName + " releasing the Lock...");
                    semaphore.release();
                    System.out.println(threadName + " : available Semaphore permit now : "
                            + semaphore.availablePermits());
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Total available Semaphore permits threads count "
                + semaphore.availablePermits());

        SemaPhoreThread thread1 = new SemaPhoreThread("Thread 1");
        thread1.start();

        SemaPhoreThread thread2 = new SemaPhoreThread("Thread 2");
        thread2.start();

        SemaPhoreThread thread3 = new SemaPhoreThread("Thread 3");
        thread3.start();

        SemaPhoreThread thread4 = new SemaPhoreThread("Thread 4");
        thread4.start();

        SemaPhoreThread thread5 = new SemaPhoreThread("Thread 5");
        thread5.start();
    }
}
