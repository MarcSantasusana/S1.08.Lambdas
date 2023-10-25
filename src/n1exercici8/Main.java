package n1exercici8;

public class Main {

    public static void main(String[] args)
    {
        ModifyString modifyString = (text) -> new StringBuilder(text).reverse().toString();

        System.out.println(modifyString.reverse("My name is Marc and I am 26 years old"));

    }
}
