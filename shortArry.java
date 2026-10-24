// check this arry is shorted or not.
public class shortArry {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,8,9,};
        boolean shorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                shorted= false;
                break;
            }
        }
        if(shorted){
            System.out.println("Array is Shorted:");
        }else{
            System.out.println("Array is not shorted:");
        }
    }
}
