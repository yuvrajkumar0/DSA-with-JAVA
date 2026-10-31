 public class findTheSecondLargest{
    public static void main(String[] args) {
        int arr[]={1,4,24,5,16,4};
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(secondLargest<arr[i] && arr[i] !=largest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
 }
