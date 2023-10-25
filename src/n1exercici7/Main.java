package n1exercici7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        List<String> list = List.of("4323445", "My name is Marc", "I am 26 years old", "65456754545454");

        list.sort(Comparator.comparing(String::length).reversed());

        System.out.println(list);
    }
}
