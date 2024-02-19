package com.lhw.demoUOG;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Backwards {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\ROGM11G\\Desktop\\JAVAFILE\\backwards.txt");

        Scanner scanner = new Scanner(fr);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] tokens = line.split("");
            int left = 0;
            int right = tokens.length-1;
            while(left < right){
                String tem = tokens[left];
                tokens[left] = tokens[right];
                tokens[right] = tem;
                left++;
                right--;
            }
            for (String token : tokens) {
                System.out.print(token);
            }
        }
        scanner.close();
    }
}
