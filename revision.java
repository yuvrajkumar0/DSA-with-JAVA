/*public class revision {
    public static void main(String[] args) {
        // sum of all element in the array:
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sum=0; 
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
    */

 public class revision {
    public static void main(String[] args) {
    
        // find even element in the given array:
         int arr[] = {1,2,3,4,5,6,7,8,9,10};
         for(int i=0; i<arr.length; i++){
            if(arr[i] % 2==0){
                System.out.println(arr[i]);
            }
         }
    }
}

