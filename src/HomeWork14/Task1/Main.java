package HomeWork14.Task1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean success = false;
        try (FileReader fr = new FileReader("D:\\romeo-and-juliet.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                stringBuilder.append((char) i);
            }
            success = true;
        } catch (IOException e) {
            System.out.println("Не нашел нужный файл!");
        }

        String longestWord = "";
        if (success) {
            Matcher matcher = Pattern.compile("[A-Za-z]+").matcher(stringBuilder);

            while (matcher.find()) {
                String newWord = matcher.group();
                if (newWord.length() > longestWord.length()) {
                    longestWord = newWord;
                }
            }

            System.out.println("Самое длинное слово - " + longestWord);
        }

        try (FileWriter fw = new FileWriter("D:\\LongestWord.txt")) {
            fw.write(longestWord);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
