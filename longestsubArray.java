public class longestsubArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,4,2,3};
        int summition = 0;
        int longest = 0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<j; k++){
                    summition += arr[k];
                    if(summition == k) 
                    {
                        longest = max(longest,j-i+1);
                }
            }
        }
    }
}
