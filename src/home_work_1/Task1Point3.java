package home_work_1;

public class Task1Point3 {
    public static void main(String[] args) {
        int firstNumber = -42;  // 0b11010110
        int secondNumber = -15; // 0b11110001

        int binaryNotResult = ~firstNumber; // ~0b11010110 (-42) = 0b00101001 (41)
        System.out.println("Побитовый оператор NOT: " + binaryNotResult);

        int binaryAndResult = firstNumber & secondNumber; // 0b11010110 (-42) & 0b11110001 (-15) = 0b11010000 (-48)
        System.out.println("Побитовый оператор AND: " + binaryAndResult);

        secondNumber &= firstNumber; // 0b11110001 (-15) & 0b11010110(-42) = 0b11010000 (-48) далее присваивает это значение (0b11010000 (-48)) переменной secondNumber
        System.out.println("Побитовый оператор AND с присвоением: " + secondNumber);
        secondNumber = -15;

        int binaryOrResult = firstNumber | secondNumber; // 0b11010110 (-42) & 0b11110001 (-15) = 0b11110111 (-9)
        System.out.println("Побитовый оператор OR: " + binaryOrResult);

        firstNumber |= secondNumber; // 0b11010110 (-42) | 0b11110001 (-15) = 0b11110111 (-9) далее присваивает это значение (0b11110111 (-9)) переменной firsNumber
        System.out.println("Побитовый оператор OR с присвоением: " + firstNumber);
        firstNumber = -42;

        int binaryXorResult = firstNumber ^ secondNumber; // 0b11010110 (-42) | 0b11110001 (-15) = 0b00100111 (39)
        System.out.println("Побитовый оператор ХOR: " + binaryXorResult);

        firstNumber ^= secondNumber; // 0b11010110 (-42) ^ 0b11110001 (-15) = 0b00100111 (39) далее присваивает это значение (0b00100111 (39)) переменной firsNumber
        System.out.println("Побитовый оператор ХOR с присвоением: " + firstNumber);
        firstNumber = -42;

        int rightShift = firstNumber >> 3; // 0b11010110 (-42) >> 3 0b11111010 (-6)
        System.out.println("Сдвиг вправно на 3: " + rightShift);

        firstNumber >>= 2; // 0b11010110 (-42) >> 2 0b11110101 (-11)
        System.out.println("Сдвиг вправно с присвоением на 2: " + firstNumber);
        firstNumber = -42;

        int leftShift = firstNumber << 1; // 0b11010110 (-42) << 1 0b10101100 (-84)
        System.out.println("Сдвиг влево на 1: " + leftShift);

        secondNumber <<= 3; // 0b11110001 (-15) << 2 0b10001000 (-120)
        System.out.println("Сдвиг влево с присвоением на 3: " + secondNumber);
        secondNumber = -15;

        int nullRightShift = firstNumber >>> 30; // 0b11010110 (-42) >>> 3 0b00000011 (3)
        System.out.println("Нулевой сдвиг вправо на 30: " + nullRightShift);

        firstNumber >>>= 29; // >>>1 0b11010110 (-42) = 0b00000111 (7) далее присваеваем это значение(0b00000101 (7)) пременной firstNumber
        System.out.println("Нулевой сдвиг вправо с присвоением на 1: " + firstNumber);
        firstNumber = -42;
    }
}
