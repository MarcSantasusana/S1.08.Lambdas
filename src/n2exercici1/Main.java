package n2exercici1;

import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        List<String> namesList = List.of("Marc", "Pere", "Joan", "Maria", "Ana", "Laura", "Albert", "Alba");

        System.out.println(returnStrings(namesList));
    }



    public static List<String> returnStrings(List<String> list)
    {
        List<String> resultList = list.stream()
                .filter(string->string.startsWith("A") && string.length() == 3)
                .toList();

        return resultList;
    }






}
