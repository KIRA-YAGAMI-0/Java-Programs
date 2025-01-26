import java.util.Scanner;
class SpecificValueFinder{
    int x[]=new int[5];
    public boolean findValue(int x[],int y){
        for (int i = 0; i < x.length; i++) {
            if (y==x[i]) {
                System.out.print("The number "+x[i]+" exist in the Array :"+"a["+i+"]");
                return true;
                
            
            } 
        }
        
        return false;
    }
}
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
         System.out.print("Do you want to see a specific value in the array:");
         int b=sc.nextInt();
        SpecificValueFinder s1=new SpecificValueFinder();
        s1.findValue(a, b);

    }
}
