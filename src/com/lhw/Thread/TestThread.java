package com.lhw.Thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThread extends Thread{
    private String url;
    private String name;
    public TestThread(String url, String name){
        this.url = url;
        this.name = name;
    }

    public void run(){
        TestDownloader testDownloader = new TestDownloader();
        testDownloader.downloader(url, name);
        System.out.println(name);
    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread("https://milngavie.cent.gla.ac.uk/idp/images/UoG_colour.png", "1.jpg");
        testThread.start();
    }
}

class TestDownloader{
    public static void downloader(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
