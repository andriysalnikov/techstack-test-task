package com.techstack.shop.util;

public class StickerPrinter {

    private static final String INVALID_PRODUCT_NAME = "Invalid product name";
    private static final String INVALID_PRICE = "Price can’t be calculated";

    public static String createSticker(String productName, String originalPrice, String tax) {

        String resultProductName = productName;
        if (productName == null || productName.isBlank()) {
            resultProductName = INVALID_PRODUCT_NAME;
        } else {
            for (int i = 0; i < productName.length(); i++) {
                if (productName.charAt(i) == ' ') {
                    continue;
                }
                if (!Character.isLetter(productName.charAt(i))) {
                    resultProductName = INVALID_PRODUCT_NAME;
                    break;
                }
            }
        }

        String resultPfoductPrice;
        if (originalPrice == null || tax == null) {
            resultPfoductPrice = INVALID_PRICE;
        } else {
            try {
                double parsedOriginalPrice = Double.parseDouble(originalPrice);
                double parsedTax = Double.parseDouble(tax);
                if (parsedOriginalPrice > 0 && parsedTax >= 0) {
                    resultPfoductPrice
                            = String.format("%.2f", parsedOriginalPrice * (1 + parsedTax/100));
                } else {
                    resultPfoductPrice = INVALID_PRICE;
                }
            } catch (NumberFormatException exception) {
                resultPfoductPrice = INVALID_PRICE;
            }
        }

        return resultProductName + " " + resultPfoductPrice;

    }

    private StickerPrinter() { }

}
