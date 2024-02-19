package com.lhw.TCPnUDP;

import java.net.*;

public class UDPClientDemo {
    public static void main(String[] args) throws Exception {
        //1.建立一个socket
        DatagramSocket datagramSocket = new DatagramSocket(8080);
        //2.建立一个包
        String msg = "nihao";
        //发送给谁
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, localhost, 9090);//数据，数据开头，数据结尾，要发送的ip，要发送的端口
        //发送
        datagramSocket.send(datagramPacket);

        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
