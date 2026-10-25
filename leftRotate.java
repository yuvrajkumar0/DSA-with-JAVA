//left Rotate the arry by one place.
public class leftRotate {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        int temp=arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
