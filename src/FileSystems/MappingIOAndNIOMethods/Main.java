package FileSystems.MappingIOAndNIOMethods;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    //Tim's advice:
    //use java  NIO when working with filesystem
    // use Java IO when reading/writing file contents


    public static void main(String[] args) {
        // converting File to Path
        File file = new File("/Examples/file.txt");   // C:\\Examples\file.txt
        Path convertedPath = file.toPath();
        System.out.println("convertedPath = " + convertedPath);

        // Passing File object and string is acceptable
        File parent = new File("/Examples");  // C:\\Examples
        File resolvedFile = new File(parent, "dir/file.txt");  // dir\\file.txt
        System.out.println(resolvedFile.toPath());

        // Passing only strings is acceptable
        resolvedFile = new File("/Examples", "dir/file.txt");  // C:\\Examples   dir\\file.txt
        System.out.println(resolvedFile.toPath());

        Path parentPath = Paths.get("/Examples");  // C:\\Examples
        Path childRelativePath = Paths.get("dir/file.txt");  // dir\\file.txt
        System.out.println(parentPath.resolve(childRelativePath));

        // using File to print working directory
        File workingDirectory = new File("").getAbsoluteFile();
        System.out.println("Working directory = " + workingDirectory.getAbsolutePath());

        // getting directory contents as strings using list()
        System.out.println("--- print Dir2 contents using list() ---");
        File dir2File = new File(workingDirectory, "/FileTree/Dir2");   // \\FileTree\Dir2
        String[] dir2Contents = dir2File.list();
        for(int i=0; i< dir2Contents.length; i++) {
            System.out.println("i= " + i + ": " + dir2Contents[i]);
        }

        // getting directory contents as files using listfiles(). Note .getName() converts the list back to strings
        System.out.println("--- print Dir2 contents using listFiles() ---");
        File[] dir2Files = dir2File.listFiles();
        for(int i=0; i< dir2Files.length; i++) {
            System.out.println("i= " + i + ": " + dir2Files[i].getName());
        }
    }
}
