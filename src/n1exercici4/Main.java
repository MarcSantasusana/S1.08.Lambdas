package n1exercici4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<String> list = List.of("January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December");

        list.forEach(System.out::println);

    }
}