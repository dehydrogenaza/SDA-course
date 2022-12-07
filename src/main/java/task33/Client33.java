package task33;

import java.io.File;

public class Client33 {

    public static void main(String[] args) {
        String path = "images";

        searchForPngOrJpgFiles(path);
    }

    private static void searchForPngOrJpgFiles(String path) {
        File file = new File(path);

        File[] filesPNG = file.listFiles(f -> f.getName().endsWith(".png"));
        File[] filesJPG = file.listFiles(f -> f.getName().endsWith(".jpg"));
        File[] directories = file.listFiles(File::isDirectory);

        for (File f : filesPNG) {
            System.out.println(path + "/" + f.getName());
        }

        for (File f : filesJPG) {
            System.out.println(path + "/" + f.getName());
        }

        for (File dir : directories) {
            searchForPngOrJpgFiles(path + "/" + dir.getName());
        }
    }

}
