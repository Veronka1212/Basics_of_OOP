package by.epam.basics_of_oop.text_file;

import java.util.Objects;

public class Directory{

    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(address, directory.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    public Directory(){
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return ", директория файла: " +address;
    }
}
