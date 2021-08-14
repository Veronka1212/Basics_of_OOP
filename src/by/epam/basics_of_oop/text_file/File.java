package by.epam.basics_of_oop.text_file;


import java.util.Objects;

public class File {

    public File(){
    }

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File textFile = (File) o;
        return Objects.equals(name, textFile.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Имя файла: "+ name +" ";
    }
}

