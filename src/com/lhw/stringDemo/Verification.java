package com.lhw.stringDemo;

import java.util.Random;

public class Verification {
    public static void main(String[] args) {
        System.out.println(createCode(5));

    }


    public static String createCode(int n){
        String code = "";
        String data = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }
}
