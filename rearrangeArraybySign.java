public class rearrangeArraybySign {
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        int [] pos = new int[arr.length/2];
        int [] neg = new int[arr.length/2];
        int p=0;
        int ng=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                pos[p] = arr[i];
                p++;
                
            }else{
                neg[ng] = arr[i];
                ng++;
            }
        }
        int ans []= new int[arr.length];
        for(int i=0; i<arr.length/2; i++){
            ans[2*i] = pos[i];
            ans[2*i+1] = neg[i];
            
        }
          for(int i=0; i<arr.length; i++){
            System.out.println(ans[i] + "");
          }      
    }
}
