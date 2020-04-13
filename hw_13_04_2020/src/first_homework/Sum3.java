package first_homework;

public class Sum3 {
    public static double Metod(double a, double b) {//Calculating the sum of long integers
        double sum03 = a + b;
        return sum03;
    }

    public static void Test(double a) {
        if (a == 5) System.out.println("test completed successfully");//testing sum4
        else System.out.println("test failed");
    }

    public static void main(String[] args) {
        System.out.println("sum3=" + Metod(2.5, 2.5));
        double a = Metod(2.5, 2.5);
        Test(a);
    }

}
