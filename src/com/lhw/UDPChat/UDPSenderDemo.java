package com.lhw.UDPChat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPSenderDemo {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String data = bufferedReader.readLine();
            byte[] bytes = data.getBytes();
            DatagramPacket localhost = new DatagramPacket(bytes, 0, bytes.length, new InetSocketAddress("localhost", 6666));
            datagramSocket.send(localhost);
            if(data.equals("bye")){
                break;
            }
        }

        datagramSocket.close();
    }
}
