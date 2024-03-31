public class Main {
    public static void main(String[] args) {

        Bird eagleObj = new Eagle();
        eagleObj.fly();
        eagleObj.swim();
        Bird.walk();

        Bird duckObj = new Bird() {
            @Override
            public void fly() {
                System.out.println("Duck's can't swim");
            }
        };

        duckObj.fly();
        duckObj.swim();

        Bird crowObj = ()->{
            System.out.println("Crow is Flying...");
        };

       crowObj.fly();
       crowObj.swim();
    }
}