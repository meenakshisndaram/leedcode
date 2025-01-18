package maxprofit;

class Solution{
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;}

                int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for (int price : prices) {

            if (price < minPrice) {

                minPrice = price;
            } else if (price - minPrice > maxProfit) {

                maxProfit = price - minPrice;
            }        }

        return maxProfit;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = solution.maxProfit(prices);
        System.out.println(result); // Output: 5
    }}
