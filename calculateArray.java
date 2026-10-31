public class calculateArray {
    public static void main(String[] args) {
        int arr[]={9,2,0,4,4,6,4,4,8,6};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
