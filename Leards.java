public class Leards {
    public static void main(String[] args) {
        int arr[] = {10,22,12,3,0,6};
         boolean leaders;
         int k=0; 
         int ans[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            leaders =true;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    leaders = false;
                    break;
                }
            }
            if(leaders == true){
                ans[k] = arr[i];
                k++;
             }
            // System.out.println(ans[i]);
        }
         
           for(int i=0; i<k; i++){
             System.out.println(ans[i]);
           }

    }
}
