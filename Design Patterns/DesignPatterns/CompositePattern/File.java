package DesignPatterns.CompositePattern;

public class File implements FileSystemComponent{
    String name;
    Folder parents;

    File(String name, Folder folder) {
        this.name = name;
        this.parents = folder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + getName());
    }
}
