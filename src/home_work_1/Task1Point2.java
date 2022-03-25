package home_work_1;

public class Task1Point2 {

    public static void main(String[] args) {
        int firstNumber = 42;  // 0b00101010
        int secondNumber = 15; // 0b00001111

        int binaryNotResult = ~firstNumber; // ~0b00101010 (42) = 0b11010101 (-43)
        System.out.println("Побитовый оператор NOT: " + binaryNotResult);

        int binaryAndResult = firstNumber & secondNumber; // 0b00101010 (42) & 0b00001111 (15) = 0b00001010 (10)
        System.out.println("Побитовый оператор AND: " + binaryAndResult);

        secondNumber &= firstNumber; // 0b00001111 (15) & 0b00101010(42) = 0b00001010(10) далее присваивает это значение (0b00001010 (10)) переменной secondNumber
        System.out.println("Побитовый оператор AND с присвоением: " + secondNumber);
        secondNumber = 15;

        int binaryOrResult = firstNumber | secondNumber; // b00101010 (42) & 0b00001111 (15) = 0b00101111 (47)
        System.out.println("Побитовый оператор OR: " + binaryOrResult);

        firstNumber |= secondNumber; // 0b00101010 (42) | 0b00001111 (15) = 0b00101111 (47) далее присваивает это значение (0b00101111 (47)) переменной firsNumber
        System.out.println("Побитовый оператор OR с присвоением: " + firstNumber);
        firstNumber = 42;

        int binaryXorResult = firstNumber ^ secondNumber; // 0b00101010 (42) | 0b00001111 (15) = 0b00100101 (37)
        System.out.println("Побитовый оператор ХOR: " + binaryXorResult);

        firstNumber ^= secondNumber; // 0b00101010 (42) ^ 0b00001111 (15) = 0b00100101 (37) далее присваивает это значение (0b00100101 (37)) переменной firsNumber
        System.out.println("Побитовый оператор ХOR с присвоением: " + firstNumber);
        firstNumber = 42;

        int rightShift = firstNumber >> 3; // 0b00101010 (42) >> 3 0b00000101 (5)
        System.out.println("Сдвиг вправно на 3: " + rightShift);

        firstNumber >>= 2; // 0b00101010 (42) >> 2 0b00001010 (10)
        System.out.println("Сдвиг вправно с присвоением на 2: " + firstNumber);
        firstNumber = 42;

        int leftShift = firstNumber << 1; // 0b00101010 (42) << 1 0b01010100 (84)
        System.out.println("Сдвиг влево на 1: " + leftShift);

        secondNumber <<= 3; // 0b00001111 (15) << 2 0b01111000 (120)
        System.out.println("Сдвиг влево с присвоением на 3: " + secondNumber);
        secondNumber = 15;

        int nullRightShift = firstNumber >>> 3; // 0b00101010 (42) >>> 3 0b00000101 (5)
        System.out.println("Нулевой сдвиг вправо на 3: " + nullRightShift);

        firstNumber >>>= 1; // >>>1 0b00101010 (42) = 0b00010101 (21) далее присваеваем это значение(0b00010101 (21)) пременной firstNumber
        System.out.println("Нулевой сдвиг вправо с присвоением на 1: " + firstNumber);
        firstNumber = 42;

    }
}
