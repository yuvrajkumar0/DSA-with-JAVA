
//reArrange Array element by sign by and remaine element pu in the last.
public class reArrangeArray {
   public static void main(String[] args) {
    int arr[] = {-1,2,3,4,-3,1};
    int pos[] = new int[arr.length];
    int neg[] = new int[arr.length];
    int p=0;
    int ne=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>0){
            pos[p] = arr[i];
            p++;
        }else{
            neg[ne]=arr[i];
            ne++;
        }
         
    }
    int ans[] = new int[arr.length];
        for(int i=0; i<2; i++){
            ans[2*i] = pos[i];
            ans[2*i+1]=neg[i];

        }
        int index =4;
        for(int i=2; i<p; i++){
            ans[index]=pos[i];
            index++;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(ans[i] + "");
        }

   } 
}
