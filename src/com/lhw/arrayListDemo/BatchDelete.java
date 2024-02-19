package com.lhw.arrayListDemo;

import java.util.ArrayList;

public class BatchDelete {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Java入门");
        arrayList.add("宁夏枸杞");
        arrayList.add("黑枸杞");
        arrayList.add("人字拖");
        arrayList.add("特级枸杞");
        arrayList.add("枸杞子");
        System.out.println(arrayList);
//        for (int i = 0; i < arrayList.size(); i++) {
//            String element = arrayList.get(i);
//            if(element.contains("枸杞")){
//                arrayList.remove(i);
//                i--;     //由于删除后后面的会往前移一位，所以索引也要往前移一位
//            }
//        }

        for(int i = arrayList.size() - 1; i >= 0; i--){
            String element = arrayList.get(i);
            if(element.contains("枸杞")){
                arrayList.remove(i);
            }
        }
        System.out.println(arrayList);
    }
}
