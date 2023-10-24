package hw0803;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.add("a");
        wordsList.add("b");
        wordsList.add("c");
        wordsList.add("d");
        wordsList.add("e");

        doubleValues(wordsList);

        for (String word : wordsList) {
            System.out.println(word);
        }
    }

    public static void doubleValues(ArrayList<String> list) {
        ArrayList<String> originalWords = new ArrayList<>(list);
        list.clear();

        for (String word : originalWords) {
            list.add(word);
            list.add(word);
        }
    }
}