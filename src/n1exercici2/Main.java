package n1exercici2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<String> list = List.of("house", "mountain", "car", "tree", "dog", "ball", "country");

        System.out.println(returnStrings(list));

    }

    public static List<String> returnStrings(List<String> list)
    {
        List<String> resultList = list.stream()
                .filter(string->string.contains("o") && string.length() > 5)
                .toList();

        return resultList;
    }
}