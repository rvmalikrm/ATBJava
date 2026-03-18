public class Lab_18Mar2026_CompileTimePolymorphism {
    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();
        int sum1 = mathUtil.add(5, 10);
        int sum2 = mathUtil.add(5, 10, 15);

        System.out.println("Sum of 5 and 10: " + sum1);
        System.out.println("Sum of 5, 10 and 15: " + sum2);
    }
}
class MathUtil {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
