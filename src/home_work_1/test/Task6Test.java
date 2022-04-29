package home_work_1.test;

import home_work_1.Task6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6Test {

    @Test
    public void getCreatePhoneNumber () {
        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        String expectedResult = "(123) 456-7890";
        String actualResult = Task6.createPhoneNumber(numbers);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
