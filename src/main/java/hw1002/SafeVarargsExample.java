package hw1002;

import java.util.Arrays;
import java.util.List;

public class SafeVarargsExample {
    @SafeVarargs
    public final <T> void process(T... items) {
        List<T> itemList = Arrays.asList(items);
        System.out.println("Processing items: " + itemList);
    }
}