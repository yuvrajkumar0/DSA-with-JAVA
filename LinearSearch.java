public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={4,2,5,8,7,5};
        int num=74;
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                System.out.println("num number is equal to given arry in index:" + i);
                found = true;
                break;
            }  
        } 
        if(! found){
            System.out.println("num is not equal to given in this arry element:");
        }
        
    }
}
