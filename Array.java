import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students to store their records:");
        int a=sc.nextInt();
        int no_of_students []=new int[a];
        int roll_no []=new int[a];
       int phone_no []=new  int[10];
        String name[]=new String[30];
        String address[]=new String[30];
        int count=1;
       for (int i = 0; i <no_of_students.length; i++) {
        
        System.out.println(count+"st Student");
        System.out.println();

           System.out.println("Enter your Name:");
           name[i]=sc.next();
           
           System.out.println("Enter your Address:");
           address[i]=sc.next();

           System.out.println("Enter your Roll_NO:");
           roll_no[i]=sc.nextInt();

           System.out.println("Enter your Phone_NO:");
           phone_no[i]=sc.nextInt();

           System.out.println();
          count++;
          
       }

       count=1;
       for (int i = 0; i <no_of_students.length; i++) {
        System.out.println(count+"st Student");
        System.out.println();

           System.out.println("Student's Name:"+name[i]);
           
           
           System.out.println("Student's Address:"+address[i]);
           

           System.out.println("Student's Roll_NO:"+roll_no[i]);
           

           System.out.println("Student's Phone_NO:"+phone_no[i]);
           

           System.out.println();
          count++;
          
       }
            

       
sc.close();
    }
}