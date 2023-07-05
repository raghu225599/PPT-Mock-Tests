import java.util.Arrays;

/*3. Write a Java program to calculate the average of a list of numbers using a do-while loop.*/
public class Program3 {
    public static void main(String[] args) {
        int[] arr={2,5,6,7,4,8,3,1,0,9};
        int i=0,average=-1;
        do{
            average+=arr[i];
            i++;
        }while(i<arr.length);
        average/=arr.length;
        System.out.println("the average of the list of elements "+Arrays.toString(arr)+" is: "+average);
    }
}
