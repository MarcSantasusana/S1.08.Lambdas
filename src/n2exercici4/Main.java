package n2exercici4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)
    {
        List<String> list = List.of("54535252", "Hello world!", "87654", "4323445", "My name is Marc", "I am 26 years old", "65456754545454");

        System.out.println("List sorted by first character: ");
        sortFirstChar(list);

        System.out.println("List sorted by letter E: ");
        sortEFirst(list);

        System.out.println("List with letter a replace by 4: ");
        replaceLetter(list);

        System.out.println("List that contains only numbers: ");
        onlyNumbers(list);

    }


    public static void sortFirstChar(List<String> list)
    {
        List<String> sortedList = list.stream()
                .sorted(Comparator.comparingInt(s -> s.charAt(0)))
                .toList();

        System.out.println(sortedList + "\n");

    }

    public static void sortEFirst(List<String> list)
    {
        List<String> sortedList = list.stream()
                .sorted(Comparator.comparing(s->!s.contains("e")))
                .toList();

        System.out.println(sortedList + "\n");
    }

    public static void replaceLetter(List<String> list)
    {
        List<String> sortedList = list.stream()
            .map(s -> (s.replace('a','4')))
                    .toList();

        System.out.println(sortedList + "\n");
    }

    public static void onlyNumbers(List<String> list)
    {
        List<String> sortedList = list.stream()
                .filter(s->s.matches("[0-9]+"))
                .toList();

        System.out.println(sortedList + "\n");
    }


}

