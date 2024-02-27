public class Driver {
    public static void main(String[] args) {
        Folder phpDemo1 = new Folder("php_demo1");
        Folder app = new Folder("app");
        Folder publicFolder = new Folder("public");
        Folder sourceFiles = new Folder("Source Files");
        File indexPhp = new File("index.php");
        File styleCss = new File("style.css");
        phpDemo1.addSubFolder(app);
        phpDemo1.addSubFolder(publicFolder);
        app.addSubFolder(sourceFiles);

        publicFolder.addFile(indexPhp);
        publicFolder.addFile(styleCss);

        // Print original structure
        System.out.println("Original Structure:");
        printFullStructure(phpDemo1);

        // Delete 'app' folder
        System.out.println("\nAfter deleting 'app':");
        phpDemo1.delete(app);
        printFullStructure(phpDemo1);

        // Delete 'public' folder
        System.out.println("\nAfter deleting 'public':");
        phpDemo1.delete(publicFolder);

        printFullStructure(phpDemo1);
    }

    public static void printFullStructure(Folder folder) {
        folder.print();
        for (Folder subfolder : folder.getSubfolders()) {
            printFullStructure(subfolder);
        }
    }
}
