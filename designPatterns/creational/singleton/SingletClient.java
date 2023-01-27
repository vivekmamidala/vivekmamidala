package designPatterns.creational.singleton;

import java.util.concurrent.CountDownLatch;

public class SingletClient {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                Singleton.getInstatncce();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                Singleton.getInstatncce();
            }
        };
        CountDownLatch l = new CountDownLatch(1);
        t1.start();
        
        
//        t1.join();
        t2.start();
        l.countDown();
        l.await();
        //Singleton s = Singleton.getInstatncce();
    }
}
