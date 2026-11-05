// Find the large element in the Arry.
public class findLarge {
    public static void main(String[] args) {
        int arr[]= {4,6,8,1,2,3};
        int large=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        System.out.println(large);
    }
}
