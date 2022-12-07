//Napisz program, który odczyta dowolny plik i zapisze go w tym samym folderze.
//        Zawartość jak i tytuł nowego pliku powinny być odwrócone (od tyłu).

package task30;

import java.io.*;
import java.util.stream.Collectors;

public class Client30 {
    private static final String PATH = "abz.txt";

    public static void main(String[] args) {
        String content = readFromFile(PATH);
        //System.out.println(content);

        String inverted = reverse(content);
        System.out.println(inverted);

        writeToFile(inverted, PATH);

    }

    private static void writeToFile(String data, String originalPath) {
        String invertedPath = reverse(originalPath.split("\\.")[0]) + ".txt";
        File invertedFile = new File(invertedPath);

        try (FileWriter myWriter = new FileWriter(invertedFile)) {
            myWriter.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String readFromFile(String path) {
        File file = new File(PATH);

        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static String reverse(String in) {
        return new StringBuilder(in).reverse().toString();
    }
}