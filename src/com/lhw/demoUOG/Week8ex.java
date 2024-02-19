package com.lhw.demoUOG;

import java.io.*;
import java.util.ArrayList;

public class Week8ex {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        try (FileReader fr = new FileReader("C:\\Users\\ROGM11G\\Desktop\\新建文本文档.txt");
             BufferedReader br =  new BufferedReader(fr);
        ) {
            String line;
            int len;
            while((line = br.readLine()) != null){
                strings.add(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(strings);

    }
}
