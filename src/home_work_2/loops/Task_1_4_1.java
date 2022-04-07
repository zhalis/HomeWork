package home_work_2.loops;

public class Task_1_4_1 {

    public static void main(String[] args) {
        long x = 1;
        long y = 3;
        long r = 0;

        while (true) {
            r = x * y;
            long ax = Math.abs(x);
            long ay = Math.abs(y);
            if (((ax | ay) >>> 31 != 0)) {
                if (y != 0 && r / y != x) {
                    System.out.println("Произошло переполнение!");
                    break;
                } else {
                    x *= y;
                }
            } else {
                x *= y;
            }
        }
        System.out.println(x);
        r = x * y;
        System.out.println(r);
    }
}
