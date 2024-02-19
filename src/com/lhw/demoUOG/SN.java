package com.lhw.demoUOG;

public class SN {
    public static void main(String[] args) {

        short[] x = {3, -6, 27, 101, 50, 0, -20, -21, 19, 6, 4, -10};
        short n = 12;
        int negSum = 0;
        short pzCount = 0;
        short oddCount = 0;
        boolean overflow = false;


        for (int i = 0; i < n; i++) {
            negSum += (x[i] < 0) ? x[i] : 0;
            pzCount += (x[i] >= 0) ? 1 : 0;
            oddCount += (x[i] > 0 && (x[i] & 1) == 1) ? 1 : 0;


            if (negSum >= 0) {
                overflow = true;
            }
        }


        System.out.println("negsum: " + negSum);
        System.out.println("pzcount: " + pzCount);
        System.out.println("oddcount: " + oddCount);
        System.out.println("overflow: " + overflow);
    }

}
