import java.util.Scanner;
class InventoryItems{
    Scanner sc = new Scanner(System.in);

    String products[] = new String[10];
    int quantity[] = new int[10];
    int sum = 0;
    int count=0;
    int temp;
    String temp1;

    void setProductNames(){
        System.out.println("Please Enter the Product Names:");
        for (int i = 0; i < products.length; i++) {
            products[i] = sc.next();
        }
        System.out.println();
    }
    void setProductQuantity(){
        System.out.println("Please Enter the quantity of the following products:");
        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i] + " : X");
            quantity[i] = sc.nextInt();
        }
        System.out.println();
    }
    void displayTotalStocks(){
        for (int i = 0; i < quantity.length; i++) {
            sum += quantity[i];
        }
        System.out.println("The total number of Stock is:" + sum);
        System.out.println();
    }
    void identifyLowStocks(){
        // System.out.println("The stocks which have level below 10:");
        for (int i = 0; i < quantity.length; i++) {
            if (quantity[i] < 10) {
                count++;
            } 
            
        }
        if (count>0) {
            System.out.println("These products need restocking:");
            for (int i = 0; i < products.length; i++) {
                if (quantity[i] < 10){

                    System.out.println(products[i] + " : X" + quantity[i]);
                }
            }
        }else{
            System.out.println("No stocking needed!");
        }
    }
    void ArrangingAscendingOrder(){
        System.out.println();
        System.out.println("Arranging the products based on highest to lowest:");
        for (int i = 0; i < quantity.length; i++) {
            for (int j = i + 1; j < quantity.length; j++) {
                if (quantity[i] < quantity[j]) {
                    temp = quantity[i];
                    quantity[i] = quantity[j];
                    quantity[j] = temp;
                    temp1 = products[i];
                    products[i] = products[j];
                    products[j] = temp1;

                }
            }
        }
    }
    void displayProductLists(){
        System.out.println();
        ArrangingAscendingOrder();
        System.out.println("The list of products are:");
        for (int i = 0; i < quantity.length; i++) {
            System.out.println(products[i] + " : X" + quantity[i]);
        }
        System.out.println();
        System.out.println("The Highest stock product is:"+products[0]+"\t X"+quantity[0]);
        System.out.println("The Lowest stock product is:"+products[9]+"\t X"+quantity[9]);
    }
   
}
public class Inventory {
    public static void main(String[] args) {
InventoryItems obj=new InventoryItems();
obj.setProductNames();
obj.setProductQuantity();
obj.displayProductLists();
obj.displayTotalStocks();
obj.identifyLowStocks();
obj.ArrangingAscendingOrder();
obj.displayProductLists();  
System.out.println();
    }

}
