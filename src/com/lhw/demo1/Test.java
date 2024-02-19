package com.lhw.demo1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        try {
            a = scanner.nextInt();
        }catch(Exception e){
            System.out.println("invalid");
            e.printStackTrace();
        }
    }


    static void test(int a) throws MyException {
        if(a > 10){
            throw new MyException(a);
        }
        System.out.println("ok");
    }
}
