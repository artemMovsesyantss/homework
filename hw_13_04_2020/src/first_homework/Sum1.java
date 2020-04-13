package first_homework;

public class Sum1 {
    public static int Metod(int a, int b) {//Calculating the sum of long integers
        int sum01 = a + b; // лишняя переменная sum01, можно сразу return a + b;
        return sum01;
    }

    public static void Test(int a) { // добавь фигурные скобки для if и else
        if (a == 4) System.out.println("test completed successfully");//testing sum4
        else System.out.println("test failed");
    } 

    public static void main(String[] args) {
        System.out.println("sum2=" + Metod(2, 2));
        int a = Metod(2, 2);
        Test(a);
    }


}
