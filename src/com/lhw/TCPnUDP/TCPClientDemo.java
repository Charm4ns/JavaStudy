package com.lhw.TCPnUDP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientDemo {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            //要知道服务器的地址
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            //要知道端口号
            int port = 9999;
            //创建一个socket连接
            socket = new Socket(serverIP, port);
            //发送消息
            outputStream = socket.getOutputStream();
            outputStream.write("nihao".getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if(outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
