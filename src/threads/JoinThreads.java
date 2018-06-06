package threads;

import java.util.Vector;

public class JoinThreads {

    private Vector<String> threadNames = new Vector<String>();

    public static void main(String[] args) {
        JoinThreads joinThreads = new JoinThreads();
        joinThreads.threadTest(50);
        System.out.println(joinThreads.threadNames);
    }

    private void threadTest(int numOfThreads) {
        Thread[] threads = new Thread[numOfThreads];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new JoinThreads.MyThread();
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException ignore) {}
        }
    }


    class MyThread extends Thread{

        @Override
        public void run() {
            for(int i=0;i<=100;i++){
                    i = i+0;
            }
            threadNames.add(getName());
        }
    }
}

