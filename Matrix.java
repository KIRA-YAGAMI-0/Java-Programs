import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        System.out.println("Please ! Enter the element of a 2X2 matrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
                
            }
           
        }

        System.out.println("Please ! Enter the element of another 2X2 matrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("The sum of the 2X2 matrix is:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

       sc.close();
    }
}