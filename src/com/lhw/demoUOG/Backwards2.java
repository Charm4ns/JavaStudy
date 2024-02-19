package com.lhw.demoUOG;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Backwards2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\ROGM11G\\Desktop\\JAVAFILE\\Backwards.txt");
            char[] inputChar = new char[1000];
            int count = 0;

            while(true){
                int charInt = fr.read();
                inputChar[count] = (char) charInt;
                count++;
                if(charInt == -1 ){
                    break;
                }
            }

            for(int i = count - 1; i >= 0; i--){
                System.out.print(inputChar[i]);
            }

    }
}
