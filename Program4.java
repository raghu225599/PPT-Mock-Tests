import java.util.Arrays;

/*4. Write a Java program to find the largest of three numbers using nested if-else statements.*/
public class Program4 {
    public static void main(String[] args) {
        int a=41,b=25,c=47;
        int largest=Integer.MIN_VALUE;
        if(a>b){
            if(a>c)
                largest=a;
            else
                largest=c;
        }else{
            if(b>c)
                largest=b;
            else
                largest=c;
        }
        System.out.println("The largest of three numbers is:"+largest);
    }
}
