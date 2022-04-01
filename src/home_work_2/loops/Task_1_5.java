package home_work_2.loops;

public class Task_1_5 {

    public static void main(String[] args) {
        int a;
        System.out.println("ТАБЛИЦА \nУМНОЖЕНИЯ");
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                a = i * j;
                System.out.print(j + " * " + i + " = " + a + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                a = i * j;
                System.out.print(j + " * " + i + " = " + a + "\t");
            }
            System.out.println();
        }
        System.out.println("ЭТО");
        System.out.println("НУЖНО");
        System.out.println("ЗНАТЬ!");
    }
}
