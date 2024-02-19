package com.lhw.demoUOG;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("C:\\Users\\ROGM11G\\Desktop\\JAVAFILE\\sum.txt");
        Scanner scanner = new Scanner(fr);
        while(scanner.hasNextLine()){
            int operand1 = scanner.nextInt();
            String operator = scanner.next();
            int operand2 = scanner.nextInt();
            int result = 0;
            switch (operator){
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
            }
            System.out.println(operand1 + operator + operand2 + "=" + result);

        }
        scanner.close();
    }
}
