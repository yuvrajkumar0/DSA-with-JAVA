public class missingNumber {
    public static void main(String[] args) {
         int arr[] = {1,2,4,5};
         int n=5;
         int hash[] = new int[n+1];
         for(int i =0; i<arr.length; i++){
            hash[arr[i]]=1;

         }
         for(int i=1; i<=n; i++){
            if(hash[i] == 0){
                System.out.println("Missing Number:" + i);
            }
         }
    }
}
