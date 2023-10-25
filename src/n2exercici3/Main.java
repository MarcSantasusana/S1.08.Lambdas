package n2exercici3;

public class Main {

    public static void main(String[] args)
    {
        Calculate add = (Float::sum);
        Calculate subtract = ((num1, num2) -> num1-num2);
        Calculate multiply = ((num1, num2) -> num1*num2);
        Calculate divide = ((num1, num2) -> num1 /num2);

        float num1 = 8;
        float num2 = 5;

        System.out.println(num1 + "+" + num2 + ": " + add.operation(num1,num2));
        System.out.println(num1 + "-" + num2 + ": " + subtract.operation(num1,num2));
        System.out.println(num1 + "*" + num2 + ": " + multiply.operation(num1,num2));
        System.out.println(num1 + "/" + num2 + ": " + divide.operation(num1,num2));
    }
}
