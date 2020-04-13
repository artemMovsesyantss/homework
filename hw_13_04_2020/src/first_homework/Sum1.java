package first_homework;

public class Sum1 {
       public static int Metod(int a, int b) {
        int sum01 = a + b;
        return sum01;
    }

    public static void Test(int a) {
        if (a ==4)System.out.println("test completed successfully");//testing sum4
        else System.out.println("test failed");
    }

    public static void main(String[] args) { //Calculating the sum of long integers
        System.out.println("sum2=" + Metod(2, 2));
        int a = Metod(2, 2);
        Test(a);
    }


}
