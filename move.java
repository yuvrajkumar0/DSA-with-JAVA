// move all zeros to the end of the array.
public class move {
    public static void main(String[] args) {
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        int j=0;
        int temp[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i] !=0){
                temp[j]=arr[i];
                j++;
                
            }
        }
        for(int i=0; i<j; i++){
            arr[i]=temp[i];
             
        }for(int i=7; i<arr.length; i++){
            arr[i]=0;
         
    } 
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }

    }
}
