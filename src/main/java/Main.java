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
                String replacedLine = replacePrepositions(line);
                writer.write(replacedLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String replacePrepositions(String line) {
        String[] prepositions = {"в", "на", "під", "перед", "за", "після", "над", "після", "серед", "між", "через",
                "поза", "біля", "о", "від", "при", "крізь", "вузько", "навколо", "окрім"};
        for (String preposition : prepositions) {
            line = line.replaceAll("\\b" + preposition + "\\b", "Java");
        }
        return line;
    }
}