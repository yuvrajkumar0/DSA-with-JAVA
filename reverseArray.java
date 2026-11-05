public class reverseArray {
    public static void main(String[] args) {
        int arr[]={5,4,7,8,9,1,5,20,3};
       int reverse[] = new int[arr.length];
       int j=0;
        for(int i=arr.length-1; i>=0; i--){
              reverse[j] = arr[i];
              j++;
        }
         System.out.println(reverse[j]);
    }
}
