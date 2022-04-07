package home_work_2.loops;

public class Task_1_1_2 {

    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);
        int a = 0;
        int b = 1;
        String result = "";

        if (value > 16) {
            System.out.println("Произошло переполнение!");
        } else {
            System.out.println(resultt(value, a, b, result));
        }
    }

    public static String resultt(int value, int a, int b, String result) {
        a++;
        if (value == a) {
            b *= a;
            return String.format("%d=%d", value, b);
        }
        b *= a;
        result = String.format("%d*", a);
        return result + resultt(value, a, b, result);
    }
}
