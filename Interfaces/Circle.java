public class Circle implements Shape{

     public static double PIE = 3.14;
    @Override
    public double calculateArea(int a) {
        return PIE*a*a;
    }

    @Override
    public int calculatePerimeter(int a) {
        return 0;
    }
}
