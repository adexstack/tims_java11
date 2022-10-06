package FileSystemsSelf;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        //System.out.println(FileSystems.getDefault());
        try{
            Path sourceFile = FileSystems.getDefault().getPath("FileTree", "file1copy1.txt");
            System.out.println(sourceFile);
            Path targetFile = FileSystems.getDefault().getPath("FileTree/Dir1", "file1.txt");
            System.out.println(targetFile);
            Files.copy(sourceFile, targetFile);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
