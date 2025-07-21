package DesignPatterns.CompositePattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Folder rootFolder = new Folder("Root" , null);
        Folder folder1 = new Folder("Documents" , rootFolder);
        Folder folder2 = new Folder("Pictures" , rootFolder);
        File file1 = new File("Resume.docx" , folder1);
        File file2 = new File("Photo.jpg", folder2);

        folder1.addComponent(file1);
        folder2.addComponent(file2);

        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);

        rootFolder.showDetails();
    }
}
