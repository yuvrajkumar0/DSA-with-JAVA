public class linear {
    public static void main(String[] args) {
        int n[] = {1,2,3,4,5,6};
        int num=4;
        boolean found =false;
        for(int i=0; i<n.length; i++){
            if(n[i]==num){
                System.out.println("fond of lean search of index of" + i);
                 found = true;
            }
        }
            if(! found){
                System.out.println("num is not equal to any");
            }
    }
}
