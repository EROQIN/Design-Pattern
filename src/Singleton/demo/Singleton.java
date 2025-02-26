package Singleton.demo;

/**
 * Singleton
 */
public class Singleton {
    private Singleton() {
        System.out.println("Singleton is created");
    }
    private static Singleton instance = new Singleton();
    public static Singleton getInstance() {
        return instance;
    }
    
}