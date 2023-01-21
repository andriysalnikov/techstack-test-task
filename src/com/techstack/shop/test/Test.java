package com.techstack.shop.test;

import com.techstack.shop.util.StickerPrinter;

public class Test {

    public static void main(String[] args) {

        System.out.println(StickerPrinter.createSticker("Kettle", "125.9", "34"));
        // Kettle 168.70600000000002
        // 125.9 * 1.34 = 168.706 -->> 168.71

        System.out.println(StickerPrinter.createSticker("", "28.35", "-25"));
        System.out.println(StickerPrinter.createSticker(null, "28.35", "-25"));
        System.out.println(StickerPrinter.createSticker("   ", "dsc", "32"));
        System.out.println(StickerPrinter.createSticker("Ke##tle", "29.50", "dc"));
        System.out.println(StickerPrinter.createSticker("Kettle", "-25.25", "-0.25"));
        System.out.println(StickerPrinter.createSticker("Чайнік", "17.50", "0.258"));
        System.out.println(StickerPrinter.createSticker("Чайнік синій", "10", "10"));
        System.out.println(StickerPrinter.createSticker("Чайнік синій", null, "10"));

    }
    
}
