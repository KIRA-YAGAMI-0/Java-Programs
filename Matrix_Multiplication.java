import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a[][]=new int[2][2];
       int b[][]=new int[2][2];
       int c[][]=new int[2][2];
       System.out.println("Please Enter the Elements for matrix A:");
       for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
            
            
            a[i][j]=sc.nextInt();

        }
        System.out.println();
       }

       System.out.println("Please Enter the Elements for matrix B:");
       for (int i = 0; i < b.length; i++) {
        for (int j = 0; j < b.length; j++) {
            b[i][j]=sc.nextInt();
        }
       }

       System.out.println("The multiplication of the two matrix is given below:");
       for (int i = 0; i < c.length; i++) {
        for (int j = 0; j < c.length; j++) {
           
           for (int k = 1; k < c.length; k++) {
            c[i][j]= (a[i][j]*b[i][j])+(a[i][k]*b[k][j]);
            System.out.print(c[i][j]+" ");
           }
        }
        System.out.println();
        
       }



       sc.close(); 
    }
}
