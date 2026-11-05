// find the second Largest Element.
public class findSecondLargest {
    public static void main(String[] args) {
        int arr[] = {4,5,6,9,8,3};
        int largest = arr[0];
        int secondLargest= -1;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>secondLargest && arr[i] != largest){
                secondLargest=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
