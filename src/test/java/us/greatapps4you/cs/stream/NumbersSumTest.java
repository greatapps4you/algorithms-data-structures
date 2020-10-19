package us.greatapps4you.cs.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumbersSumTest {

    private List<Integer> numbers;
    private Map<String, Integer> numbersMap;

    @BeforeEach
    void setup() {
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbersMap = new HashMap<>();
        numbersMap.put("ONE", 1);
        numbersMap.put("TWO", 2);
        numbersMap.put("THREE", 3);
        numbersMap.put("FOUR", 4);
        numbersMap.put("FIVE", 5);
        numbersMap.put("SIX", 6);
        numbersMap.put("SEVEN", 7);
        numbersMap.put("EIGHT", 8);
        numbersMap.put("NINE", 9);
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

    @Test
    void sumNumbersWithCollect() {
        Integer actual = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        Assertions.assertEquals(45, actual);
    }

    @Test
    void sumNumbersWithIntStream() {
        Integer actual = numbers.stream().mapToInt(Integer::intValue).sum();
        Assertions.assertEquals(45, actual);
    }

    @Test
    void sumNumbersWithMap() {
        Integer actual = numbersMap.values().stream().mapToInt(Integer::valueOf).sum();
        Assertions.assertEquals(45, actual);
    }


}