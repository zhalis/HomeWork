package home_work_2.loops;

public class Task_1_2 {

    public static String isResultMultiplying(String[] args) {
        int i = 0;
        String resultMultiplying = "";
        long result = 1;
        String targetString = args[0];

        for (char character : targetString.toCharArray()) {
            if (('.' == character) || (',' == character))  {
                resultMultiplying = "Введено не целое число!";
                break;
            } else if (!Character.isDigit(character)) {
                resultMultiplying = "Введено не число!";
                break;
            } else {
                long currentDigit = Long.parseLong(String.valueOf(character));
                result *= currentDigit;
                if (i < targetString.length() - 1) {
                    resultMultiplying += String.format("%d * ", currentDigit);
                    i++;
                } else if (i == targetString.length() - 1) {
                    resultMultiplying += String.format("%d = %d", currentDigit, result);
                }
            }
        }
        return resultMultiplying;
    }
}
