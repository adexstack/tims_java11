package FileSystems.WalkTree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CompareDirectory {
    public static void main(String[] args) throws IOException {

        Path one = FileSystems.getDefault().getPath("C:/Users/saade/IdeaProjects/com.timbuch/FileTree/Tree1");
        Path other = FileSystems.getDefault().getPath("C:/Users/saade/IdeaProjects/com.timbuch/FileTree/Tree2");
        List<String> unequalFiles = new ArrayList<>();
            Files.walkFileTree(one, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file,
                                                 BasicFileAttributes attrs)
                        throws IOException {
                    FileVisitResult result = super.visitFile(file, attrs);

                    // get the relative file name from path "one"
                    Path relativize = one.relativize(file);
                    // construct the path for the counterpart file in "other"
                    Path fileInOther = other.resolve(relativize);
                    String d = String.format("=== comparing: %s to %s", file, fileInOther);
                    System.out.println(d);

                    byte[] otherBytes = Files.readAllBytes(fileInOther);
                    byte[] theseBytes = Files.readAllBytes(file);
                    if (!Arrays.equals(otherBytes, theseBytes)) {
                        String unequals = file + " is not equal to " + fileInOther;
                        unequalFiles.add(unequals);
                        //throw new AssertionFailedError(file + " is not equal to " + fileInOther);
                    }
                    return result;
                }
            });
        //System.out.println(unequalFiles); Prints list of all the differences
        unequalFiles.forEach(System.out::println);
        }
    }
