package home_work_2.loops;

public class Task_1_1_1 {

    public String multiplicationTo(String[] args) {
        String result = "";
        int a = 1;
        int b = 0;
        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
            b++;
            a *= i;
            if (i < Integer.parseInt(args[0])) {
                result += String.format("%d * ", i);
            } else if (i == Integer.parseInt(args[0])) {
                result += String.format("%d = %d", i, a);
            }

        }
        if (b > 16) {
            return "Произошло переполнение!";
        } else {
            return result;
        }
    }
}
