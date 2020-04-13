package first_homework;

public class Sum2 {
    public static int Metod(int a, int b) {//Calculating the sum of long integers
        int sum02 = a + b;
        return sum02;
    }

    public static void Test(int a) {
        if (a == 0) System.out.println("test completed successfully");//testing sum4
        else System.out.println("test failed");
    }

    public static void main(String[] args) {
        System.out.println("sum2=" + Metod(-2, 2));
        int a = Metod(-2, 2);
        Test(a);
    }
}
