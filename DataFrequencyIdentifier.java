public class DataFrequencyIdentifier {
    public static void main(String args[]){
        int arr[]={5,7,2,4,5,5,3};
        int count;
       
        for (int i = 0; i < arr.length; i++) {
            count=1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    
                }
                
            }
            System.out.println("The Frequency of "+arr[i]+" is "+count);
        }
        
        
    }
}
