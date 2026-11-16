public class selectionSort {
    public static void main(String[] args) {
        // Selection Sort:

        int arr [] ={4,5,1,2,3,5,4,7,5};
        for(int i=0; i<arr.length-1; i++){
            int smallestIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[smallestIndex]){
                    smallestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;

        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
