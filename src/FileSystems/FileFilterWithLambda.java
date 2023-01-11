package FileSystems;

import java.io.IOException;
import java.nio.file.*;

public class FileFilterWithLambda {
    // https://docs.oracle.com/javase/8/docs/api/java/nio/file/FileSystem.html#getPathMatcher-java.lang.String-
    public static void main(String[] args) {

//        DirectoryStream.Filter<Path> filter =
//                new DirectoryStream.Filter<Path>() {
//                    public boolean accept(Path path) throws IOException {
//                        return (Files.isRegularFile(path));
//                    }
//                };

        //(Optimized) -> Using this one line Lambda Expression replaces all 4 lines above
        //isRegularFile would only print out files and not directory
        // read up Globs
        DirectoryStream.Filter<Path> filterDir = Files::isDirectory;
        //DirectoryStream.Filter<Path> filterRegFile = p -> Files.isRegularFile(p);  //using lambda
        DirectoryStream.Filter<Path> filterRegFile = Files::isRegularFile; //replacing the lambda above with method reference


        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");  // FileTree\\Dir2 (windows)
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filterRegFile)) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
                System.out.println(file.getFileName().toAbsolutePath());
                System.out.println(file.toAbsolutePath());
            }

        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }
    }
}
