public class Leaders {
    public static void main(String[] args) {

        int arr[] = {10, 22, 12, 3, 0, 6};

        int ans[] = new int[arr.length];

        int k = arr.length - 1;
        int maxi = Integer.MIN_VALUE;

        
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] >= maxi) {
                ans[k] = arr[i];
                k--;
            }

            maxi = Math.max(maxi, arr[i]);
        }

        
        for (int i = k + 1; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}