public class Ex8AreaCalculator {

    public static double area (double radious) {
        return (radious <0) ? -1 : radious * radious * Math.PI;
    }
    public static double area (double x, double y) {
        return (x <0 || y <0) ? -1 : x * y;
    }
}
