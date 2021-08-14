package by.epam.basics_of_oop.text_file;

//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input();
        TextFile file = new TextFile();
        Directory directory = new Directory();
        System.out.println("Введите адрес директории");
        directory.setAddress(s.nextLine());
        file.setDirectory(directory);

        System.out.println("Введите имя файла");
        file.setName(s.nextLine());

        System.out.println("Введите текст файла");
        file.setText(s.nextLine());

        System.out.println(file.toString());

        System.out.println("Что будем делать?\n" +
                "1 - переименовать файл\n" +
                "2 - вывести на консоль содержимое\n" +
                "3 - дополнить\n" +
                "4 - удалить\n");
        int x = input.UserInput();
        switch (x) {
            case 1: {
                System.out.println("Введите новое имя файла: ");
                file.renameTextFile(file, s.nextLine());
                System.out.println(file.toString());
                break;
            }
            case 2: {
                file.printTextFile();
                break;
            }
            case 3: {
                System.out.println("Введите текст дополнение: ");
                file.addTextFile(file,s.nextLine());
                file.printTextFile();
                break;
            }
            case 4: {
                file.deleteFile();
                break;
            }
        }
    }
}
