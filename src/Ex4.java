import java.util.Arrays;

public class Ex4 {
    public static int cheapestKeyboard(int[] keyboards) {
        int minPrice = 10000;
        for (int price : keyboards)
            if (price < minPrice)
                minPrice = price;
        return minPrice;
    }

    public static int mostExpesiveDevice(int[] keyboards, int[] usb) {
        int maxPrice = 0;
        for (int priceKeyboars : keyboards)
            if (priceKeyboars > maxPrice)
                maxPrice = priceKeyboars;

        for (int priceUsb : usb)
            if (priceUsb > maxPrice)
                maxPrice = priceUsb;

        return maxPrice;
    }

    public static int affordedKeyboard(int[] keyboards, int budget) {
        int maxPrice = 0;
        for (int priceKeyboars : keyboards)
            if (priceKeyboars > maxPrice && priceKeyboars <= budget)
                maxPrice = priceKeyboars;

        return maxPrice;
    }

    public static int totalCostCalc(int[] keyboars, int[] usb, int budget) {
        int bestCase = 0;
        for (int keyboardPrice : keyboars) {
            for (int usbPrice : usb) {
                int total = keyboardPrice + usbPrice;
                if (total <= budget && total > bestCase)
                    bestCase = total;
            }
        }
        return bestCase;
    }
}
