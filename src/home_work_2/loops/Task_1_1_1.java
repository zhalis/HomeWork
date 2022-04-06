package home_work_2.loops;

public class Task_1_1_1 {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        String result = "";

        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
            b++;
            a *= i;
            if (i < Integer.parseInt(args[0])) {
                result += String.format("%d*", i);
            } else if (i == Integer.parseInt(args[0])) {
                result += String.format("%d=%d", i, a);
            }

        }
        if (b > 16) {
            System.out.println("Произошло переполнение!");
        } else {
            System.out.println(result);
        }
    }
}
