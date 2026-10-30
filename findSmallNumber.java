public class findSmallNumber{
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,68,8,9,10};
        int small = arr[0]; 
        for(int i=1; i<arr.length; i++){
            if(small>arr[i]){
                small = arr[i];
            }
        }
        System.out.println(small);
    }
}
