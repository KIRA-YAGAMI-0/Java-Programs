import java.util.Scanner;
public class Array_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter numbers to store in the Array:");
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
       
            System.out.println("The sum of the array is:"+sum);
        

    }
}
