package DesignPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{

    String name;
    List<FileSystemComponent> componentList;
    Folder parents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent fileSystemComponent) {
        componentList.add(fileSystemComponent);
    }

    public void RemoveComponentList(FileSystemComponent fileSystemComponent) {
        componentList.remove(fileSystemComponent);
    }

    Folder(String name, Folder folder) {
        this.name = name;
        this.parents = folder;
        componentList = new ArrayList<>();
    }

    @Override
    public void showDetails() {
        for(FileSystemComponent component : componentList) {
            String s = "";
            if(component instanceof Folder) System.out.println("Folder" + ": " + ((Folder) component).getName());
            else if(component instanceof File) System.out.println("File" + ": " + ((File) component).getName());
        }
    }
}
