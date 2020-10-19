package us.greatapps4you.cs.stream;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumbersSumTest {

    private List<Integer> numbers;

    @BeforeEach
    void setup() {
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    @Test
    void sumNumbersWithReduce() {
        Integer actual = numbers.stream().reduce(0, (a, b) -> a + b);
        Assertions.assertEquals(45, actual);
    }

    @Test
    void sumNumbersWithExistingMethodReference() {
        Integer actual = numbers.stream().reduce(0, Integer::sum);
        Assertions.assertEquals(45, actual);
    }

    @Test
    void sumNumbersWithCustomMethodReference() {
        Integer actual = numbers.stream().reduce(0, NumbersSum::sum);
        Assertions.assertEquals(45, actual);
    }


}