import java.util.ArrayList;
import java.util.List;

class Folder {
    private final String name;
    private final List<Folder> subFolders;
    private final List<File> files;

    public Folder(String name) {
        this.name = name;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void print() {
        System.out.println("Folder: " + name);
        for (Folder folder : subFolders) {
            folder.print();
        }
        for (File file : files) {
            file.print();
        }
    }

    public void delete(Folder folder) {
        this.subFolders.remove(folder);
        folder.files.clear();
    }
}