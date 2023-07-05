import java.util.Scanner;

/*2. Write a Java program to print the Fibonacci series up to a given number using a for loop.*/
public class Program2 {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter an positive integer number to print fibonacci upto that number:");
        int number=scanner.nextInt();
        if(number>0 && number>1) {
            int fib0 = 0;
            int fib1 = 1;
            int fibn = 0;
            for (int i = 2; i <= number; i++) {
                fibn = fib0 + fib1;
                fib0 = fib1;
                fib1 = fibn;
            }
            System.out.println("fibonacci of number " + number + " is: " + fibn);
        }
        else if(number<0) {
            System.out.println("entered negative number");
        }
        else if(number==0||number==1){
            System.out.println("the fibnacci of number "+number+" is:"+number);
        }
    }
}
