package threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadWaitAndNotify {

    public static Object lock =new Object();
    public static List<String> list = new ArrayList<String>();
    static int count = 0;

    public static void main(String[] args) {
        new Producer().start();
        new Consumer().start();
    }

    static class Producer extends Thread {

        @Override
        public void run() {
            while (true){

                if(count == 10)
                {
                    System.exit(0);
                }

                synchronized (lock){
                    if(list.size()==0){
                        System.out.println("Producer Added A");
                        list.add("A");

                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notify();
                }
            }
        }
    }

    static class Consumer extends Thread{

        @Override
        public void run() {
            while (true){
                synchronized (lock){


                    if(list.size()==1){
                        System.out.println("Consumer Consumes A");
                        list.remove(0);
                        count++;
                        lock.notify();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }
        }
    }
}
