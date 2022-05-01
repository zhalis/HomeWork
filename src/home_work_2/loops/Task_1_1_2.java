package home_work_2.loops;

public class Task_1_1_2 {

    public static String multiplicationTo(int multiplyToNumber, int counter, int numberToBeMultiplied, String result) {
        if (multiplyToNumber > 16) {
            return "Произошло переполнение!";
        }
        counter++;
        if (multiplyToNumber == counter) {
            numberToBeMultiplied *= counter;
            return String.format("%d = %d", multiplyToNumber, numberToBeMultiplied);
        }
        numberToBeMultiplied *= counter;
        result = String.format("%d * ", counter);
        return result + multiplicationTo(multiplyToNumber, counter, numberToBeMultiplied, result);
    }
}
