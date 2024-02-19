package com.lhw.stringDemo;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入登录名：");
            String loginName = scanner.nextLine();
            System.out.println("请输入密码：");
            String password = scanner.nextLine();
            boolean rs = login(loginName,password);
            if(rs){
                System.out.println("欢迎");
                break;
            }else{
                System.out.println("再试一次");
            }
        }

    }


    public static boolean login(String loginName, String password){
        String correctLoginName = "lhw2000";
        String correctPassword = "123456";
        if(correctLoginName.equals(loginName)){
            if(correctPassword.equals(password)){
                return true;
            }else{
                System.out.println("密码错误");
                return false;
            }
        }else{
            System.out.println("用户名错误");
            return false;
        }

    }
}
