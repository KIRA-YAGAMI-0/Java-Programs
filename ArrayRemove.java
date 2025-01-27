import java.util.Scanner;

public class ArrayRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want in the Array:");
        int in = sc.nextInt();
        int a[] = new int[in];

        System.out.println("Please ! Enter the numbers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int newarr[] = new int[in - 1];
        System.out.println("Enter the number from the list to remove:");
        int removeIndex = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (removeIndex==a[i]) {
                continue;
            }
            newarr[i] = a[i];
        }

        System.out.println("The Updated Array is given below:");
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
}
