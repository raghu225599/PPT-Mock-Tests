import java.util.Scanner;

/*1. Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.*/
public class Program1 {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter an integer number:");
        int number=scanner.nextInt();
        if(number<0)
            System.out.println("given number is negative");
        else if(number==0)
            System.out.println("given number is zero");
        else
            System.out.println("given number is positive");
    }
}
