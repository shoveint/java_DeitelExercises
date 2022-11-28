package Chapter7;

public class VarargsTest {
    public static double average(double...numbers) {
        double total = 0.0;
        for (double d : numbers) {
            total += d;
        }
        return total / numbers.length;
    }
    public static void main(String[] args){
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;
        System.out.printf("d1 = %.f%nd = %.1f%nd3 v");
    }
}
