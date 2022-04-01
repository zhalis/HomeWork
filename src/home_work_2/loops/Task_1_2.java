package home_work_2.loops;

public class Task_1_2 {

    public static void main(String[] args) {

        System.out.println(isResultMultiplying(args));

    }

    public static String isResultMultiplying(String[] args) {
        int i = 0;
        String resultMultiplying = "";
        long result = 1;
        String targetString = args[0];

        for (char character : targetString.toCharArray()) {
            if (('.' == character) || (',' == character))  {
                resultMultiplying = "Введено не целое число!";
                break;
            } else if (isNotDigit(character)) {
                resultMultiplying = "Введено не число!";
                break;
            } else {
                long currentDigit = Long.parseLong(String.valueOf(character));
                result *= currentDigit;
                if (i < targetString.length() - 1) {
                    resultMultiplying += String.format("%d*", currentDigit);
                    i++;
                } else if (i == targetString.length() - 1) {
                    resultMultiplying += String.format("%d=%d", currentDigit, result);
                }
            }
        }
        return resultMultiplying;
    }

    /**
     * определяет цивра или инной символ
     *
     * @param character символ
     * @return true или false
     */
    public static boolean isNotDigit(char character) {

        switch (character) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return false;
            default:
                return true;
        }
    }
}
