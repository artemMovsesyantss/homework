package first_homework;

public class Sum4 {
    public static long Metod(long a, long b) {//Calculating the sum of long integers
        long sum04 = a + b;
        return sum04;
    }

    public static void Test(long a) {
        if (a ==2200000000L)System.out.println("test completed successfully");//testing sum4
        else System.out.println("test failed");
    }

    public static void main(String[] args) {
        System.out.println("sum4=" + Metod(2000000000, 200000000));
        long a = Metod(2000000000, 200000000);
        Test(a);
    }
}
