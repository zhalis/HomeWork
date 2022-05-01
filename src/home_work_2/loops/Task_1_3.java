package home_work_2.loops;

public class Task_1_3 {

    public static String exponentiation(double targetNumber, int powerNumber) {
        double result = targetNumber;

        if (powerNumber == 0) {
            result = 1;
        } else if (powerNumber < 0) {
            return "Нужно ввести положительное число!";
        }

        for (int i = 1; i < powerNumber; i++) {
            result = result * targetNumber;
        }
        return targetNumber + " ^ " + powerNumber + " = " + result;
    }
}
