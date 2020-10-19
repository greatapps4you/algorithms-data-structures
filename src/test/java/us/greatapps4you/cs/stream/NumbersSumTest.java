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
    private List<Item> salesBasket;
    private String rawData;

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

        salesBasket = Arrays.asList(new Item(1, 10), new Item(2, 15), new Item(3, 25), new Item(4, 40));
        rawData = "Item1 10 Item2 25 Item3 30 Item4 45";
    }

    /**
     * Sum List of Numbers
     */

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

    /**
     * Sum List of Objects with a Number Field
     */

    @Test
    void sumNumbersfromObjectWithReduce() {
        Integer actual = salesBasket.stream()
            .map(item -> item.getPrice())
            .reduce(0, (a, b) -> a + b);
        Assertions.assertEquals(90, actual);
    }

    @Test
    void sumNumbersfromObjectWithExistingMethodReference() {
        Integer actual = salesBasket.stream()
            .map(item -> item.getPrice())
            .reduce(0, Integer::sum);
        Assertions.assertEquals(90, actual);
    }

    @Test
    void sumNumbersfromObjectWithCustomMethodReference() {
        Integer actual = salesBasket.stream()
            .map(item -> item.getPrice())
            .reduce(0, NumbersSum::sum);
        Assertions.assertEquals(90, actual);
    }

    @Test
    void sumNumbersfromObjectWithCollect() {
        Integer actual = salesBasket.stream()
            .map(item -> item.getPrice())
            .collect(Collectors.summingInt(Integer::intValue));
        Assertions.assertEquals(90, actual);
    }

    @Test
    void sumNumbersfromObjectWithIntStream() {
        Integer actual = salesBasket.stream()
            .mapToInt(item -> item.getPrice())
            .sum();
        Assertions.assertEquals(90, actual);
    }

    /**
     * Sum a Numbers list extracted from Text
     */

    @Test
    void sumNumbersFromTextWithIntStream() {
        Integer actual = Arrays.stream(rawData.split(" "))
            .filter((number) -> number.matches("\\d+"))
            .mapToInt(Integer::valueOf)
            .sum();
        Assertions.assertEquals(110, actual);
    }

}