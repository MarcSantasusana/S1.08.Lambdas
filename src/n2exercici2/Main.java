package n2exercici2;

import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        List<Integer> numbersList  = List.of(15,75,43,22,87,14,74,32,88,65,79,11);

        System.out.println(returnString(numbersList));

    }

    public static String returnString(List<Integer> numbersList)
    {
        StringBuilder resultString = new StringBuilder();

        numbersList.forEach(number->{
            if(number%2 == 0)
            {
                resultString.append("e"+number+", ");
            }
            else
            {
                resultString.append("o"+number+", ");
            }
        });

        return resultString.toString();
    }
}
