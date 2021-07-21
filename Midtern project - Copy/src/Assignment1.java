public class Assignment1 {

    private static int myFun(int[] prices) {
        int price = 0;
        int result = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            result = Math.max(price - prices[i], result);
            price = Math.max(price, prices[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myFun(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
