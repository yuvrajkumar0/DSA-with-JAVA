public class stockBuyAndSell {
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        int maxProfit = 0; 
        int bestBuy= price[0];
        for(int i=1; i<price.length; i++){
            if(price[i]>bestBuy){
                maxProfit = Math.max(maxProfit,price[i]-bestBuy);
            }
            bestBuy = Math.min(bestBuy,price[i]);
        }
        System.out.println(maxProfit);
    }
}
