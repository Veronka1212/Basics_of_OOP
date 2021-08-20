package by.epam.oop5.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputData {

    public static List<String> setListOfTreasures() {
        List<String> treasuresReadFromFile = new ArrayList<>();
        try {
            FileReader reader = new FileReader("C:\\Users\\nikah\\IdeaProjects\\DragonCave\\Treasures.txt");
            BufferedReader buffReader = new BufferedReader(reader);
            while (buffReader.ready()) {
                treasuresReadFromFile.add(buffReader.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return treasuresReadFromFile;
    }

    public static String setNameOfTreasureFromFile(String line) {
        Pattern pattern = Pattern.compile("[а-я]+");
        Matcher matcher = pattern.matcher(line);
        final boolean b = matcher.find();
        return matcher.group();
    }

    public static int setCostOfTreasureFromFile(String line) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(line);
        final boolean b = matcher.find();
        return Integer.parseInt(matcher.group());
    }
}