public class findLargestNumber {
    public static void main(String[] args) {
        int arr[] = {6,5,7,8,9,51};
        int large = 0; 
        for(int i=0; i<arr.length; i++){
             if(large<arr[i]){
                large =arr[i];
             }
        }
        System.out.println(large);
    }
}
