public class checkPalindrome{
    public void checkPali(int n){
        int reverse = 0;
        int original = n;
        while(n>0){
        int digit = n%10;
        reverse = reverse* 10 +digit;
        n = n/10;
        }if(original==reverse){
            System.out.println("This number is palindrome Number: ");
        }else{
            System.out.println("This number is Not palindrome Number: ");
        }
         

    }
    public static void main(String[] args){
        checkPalindrome ck = new checkPalindrome();
        ck.checkPali(353);
    }
}