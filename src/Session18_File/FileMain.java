package src.Session18_File;

import java.io.File;

public class FileMain {
    public static void main(String[] args) {
        File file = new File("newFile.txt");
        System.out.println(file.exists());

    }
}
