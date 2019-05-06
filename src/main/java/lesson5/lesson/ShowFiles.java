package lesson5.lesson;

import java.io.File;

public class ShowFiles {

    public static void main(String[] args) {
        File rootDir = new File("c:\\Users\\OKrylov\\Google Диск\\My Library\\");
        viewDir(rootDir, "");
    }

    private static void viewDir(File rootDir, String prefix) {
        if (rootDir.isFile()) {
            System.out.println(prefix + "File: " + rootDir.getName());
        }
        else {
            System.out.println(prefix + "Dir: " + rootDir.getName());
            for (File file : rootDir.listFiles()) {
                viewDir(file, prefix + "    ");
            }
        }
    }
}
