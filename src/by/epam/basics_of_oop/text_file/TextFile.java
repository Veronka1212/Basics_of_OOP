package by.epam.basics_of_oop.text_file;

import java.util.Objects;

public class TextFile extends by.epam.basics_of_oop.text_file.File {

    private Directory directory;
    private String text;

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void renameTextFile(TextFile file, String newName) {
        file.setName(newName);
    }

    public void addTextFile(TextFile text,String t) {
        text.setText(text.getText().concat(t));

    }

    public void printTextFile() {
        System.out.println(text.toString());
    }

    public void deleteFile() {
        System.out.println("Файл удален");
    }

    @Override
    public String toString() {
        return "Имя файла: "+getName().toString()+getDirectory().toString()+", содержание файла: " + text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(text, textFile.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }

    public TextFile() {
    }

    public TextFile(String name) {
        super(name);
    }

    public TextFile(String name, String text, Directory directory) {
        super(name);
        this.text = text;
        this.directory = directory;
    }

}
