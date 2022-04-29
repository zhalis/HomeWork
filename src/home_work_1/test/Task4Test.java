package home_work_1.test;

import home_work_1.Task4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4Test {

    @Test
    public void returnWeekend() {
        String weekend = "суббота";
        String expectedResultWeekend = "выходной";
        String actualResult = Task4.workingDayOrWeekend(weekend);

        Assertions.assertEquals(expectedResultWeekend, actualResult);
    }

    @Test
    public void returnWorkingDay() {
        String workingDay = "среда";
        String expectedResultWorkingDay = "рабочий";
        String actualResult = Task4.workingDayOrWeekend(workingDay);

        Assertions.assertEquals(expectedResultWorkingDay, actualResult);
    }

    @Test
    public void isWeekDayOff() {
        boolean isWeekDay = true;
        boolean isVacation = false;
        boolean expectedResult = true;
        boolean actualResult = Task4.sleepIn(isWeekDay, isVacation);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsWorkingDay() {
        boolean isWeekDay = false;
        boolean isVacation = false;
        boolean expectedResult = false;
        boolean actualResult = Task4.sleepIn(isWeekDay, isVacation);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
