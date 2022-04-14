package home_work_3.runners;

public class WithoutCalculator {

    public static void main(String[] args) {
        double a = 4.1;
        double b = 15.0;
        double c = 7.0;
        double d = 28.0;
        double e = 5.0;
        double result;

        result = b * c; //15 * 7 = 105
        System.out.println(result);

        result = d / e; // 28 / 5 = 5.6
        System.out.println(result);

        result = Math.pow(5.6, 2); // 5.6 * 5.6 =31.35999999
        System.out.println(result);

        result = 4.1 + 105 + 31.3599999;
        System.out.println(result);

        result = a + b * c + Math.pow((d / e), 2); // 15 * 7 = 105; 28 / 5 =5.6; 5.6 * 5.6 = 31.36; 4.1 + 105 + 31.36 = 140.46
        System.out.println(result);
    }
}
