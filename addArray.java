public class addArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={2,3,4,5,6};
        int result[] = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            
            result[i] = arr1[i] + arr2[i];
        
        }
      System.out.println("addition of arry is:");
      for(int i=0; i<arr1.length; i++){
        System.out.print(result[i]);

      }
    }
     
    
}
