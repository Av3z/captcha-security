package me.willyan.captchasegurity.util;

import java.util.Random;

public class Captcha {


    private static Random random = new Random();

    static public String security() {

        String[] caracteres= {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b",
                "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H",
                "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                "@","#","$","!","%"};

        String captcha = "";


        for (int i = 0; i < 10; i++) {
            int l = random.nextInt(caracteres.length);
            captcha += caracteres[l];
        }

       return captcha;
    }
}
