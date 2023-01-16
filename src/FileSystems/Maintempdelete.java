package FileSystems;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Maintempdelete {
    public static void main(String[] args) {
        System.out.println(FileSystems.getDefault().getPath("..").normalize().toAbsolutePath());
        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubdirectoryFile.txt");
        System.out.println(path2.normalize().toAbsolutePath());
    }
}
