package hw1002;

import java.util.List;

public class SuppressWarningsExample {
    @SuppressWarnings("unchecked")
    public List<String> getStrings() {
        return (List<String>) someMethodThatGeneratesRawList();
    }

    private List someMethodThatGeneratesRawList() {
        return List.of("Item1", "Item2");
    }
}