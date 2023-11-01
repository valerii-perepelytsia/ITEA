import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/input.txt"));

            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    if (isPreposition(word)) {
                        words[i] = "Java";
                    }
                }
                String replacedLine = String.join(" ", words);
                writer.write(replacedLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isPreposition(String word) {
        String[] prepositions = {"в", "на", "під", "перед", "за", "після", "над", "після", "серед", "між", "через",
                "поза", "біля", "о", "від", "при", "крізь", "навколо", "окрім"};
        for (String preposition : prepositions) {
            if (word.equalsIgnoreCase(preposition)) {
                return true;
            }
        }
        return false;
    }
}