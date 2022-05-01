package home_work_2.loops;

public class Task_1_4 {

    public static String multiplyToOverflow(long numberToBeMultiplied, long multiplier) {
        long r = 0;

        while (true) {
            r = numberToBeMultiplied * multiplier;
            long ax = Math.abs(numberToBeMultiplied);
            long ay = Math.abs(multiplier);
            if (((ax | ay) >>> 31 != 0)) {
                if (multiplier != 0 && r / multiplier != numberToBeMultiplied) {
                    break;
                } else {
                    numberToBeMultiplied *= multiplier;
                }
            } else {
                numberToBeMultiplied *= multiplier;
            }
        }
        r = numberToBeMultiplied * multiplier;
        return "Произошло переполнение!" + "\nЗначение до переполнения: " + numberToBeMultiplied + "\nЗначение после переполнения: " + r;
    }
}
