package designPatterns.creational.singleton;

public class VolatileTest {
    public class VolatileData   
{  
private volatile int counter = 0;   
public int getCounter()   
{  
return counter;  
}  
public void increaseCounter()   
{  
++counter;      //increases the value of counter by 1   
}  
}  

public class VolatileThread extends Thread   
{  
private final VolatileData data;  
public VolatileThread(VolatileData data)   
{  
this.data = data;         
}  
@Override  
public void run()  
{
for(int i = 0; i < 10000; i++) {  
int oldValue = data.getCounter();  
System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);  
data.increaseCounter();  
int newValue = data.getCounter();  
System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);  
}
}  
}
private final static int noOfThreads = 2;  
public static void main(String[] args) throws InterruptedException  
{  
VolatileData volatileData = new VolatileTest().new VolatileData();     //object of VolatileData class  
Thread[] threads = new Thread[noOfThreads];     //creating Thread array   
for(int i = 0; i < noOfThreads; ++i)  
threads[i] = new VolatileTest().new VolatileThread(volatileData);  
for(int i = 0; i < noOfThreads; ++i)  
threads[i].start();                 //starts all reader threads  
for(int i = 0; i < noOfThreads; ++i)  
threads[i].join();                  //wait for all threads  
}  

}
