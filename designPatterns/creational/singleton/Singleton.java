package designPatterns.creational.singleton;

/*
 * 1.ntinalize the class in static declaration dis:can not pass variables,early initilalization
 * 2.synchronize the getinstance method dis.performance imact
 * 3.add sync black inside the method dis: extra if condition for initila few threads
 * 3 is best
 */
public class Singleton {
    private static Singleton instance=null;
    private Singleton() {
        System.out.println("instance created");
    }

    public static Singleton getInstatncce(){
        
        if(instance == null) {
            instance = new Singleton(); 
        }
        return instance;
    }
}
