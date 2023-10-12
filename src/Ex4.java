import java.util.Arrays;

public class Ex4 {
    public int cheapestKeyboard(int[] keyboards) {
        int minPrice = 10000;
        for (int price : keyboards)
            if (price < minPrice)
                minPrice = price;
        return minPrice;
    }

    public int mostExpesiveDevice(int[] keyboards, int[] usb) {
        int maxPrice = 0;
        for (int priceKeyboars : keyboards)
            if (priceKeyboars > maxPrice)
                maxPrice = priceKeyboars;

        for (int priceUsb : usb)
            if (priceUsb > maxPrice)
                maxPrice = priceUsb;

        return maxPrice;
    }

    public int affordedKeyboard(int[] keyboards, int budget) {
        int maxPrice = 0;
        for (int priceKeyboars : keyboards)
            if (priceKeyboars > maxPrice && priceKeyboars <= budget)
                maxPrice = priceKeyboars;

        return maxPrice;
    }
}
