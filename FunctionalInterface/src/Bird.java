@FunctionalInterface
public interface Bird {

    void fly();

    default void swim(){
        System.out.println("Birds Can't Swim");
    }
    static void walk(){
        System.out.println("Birds Walk Slowly");
    }

    String toString();
}
