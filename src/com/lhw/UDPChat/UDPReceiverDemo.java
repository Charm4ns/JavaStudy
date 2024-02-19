package com.lhw.UDPChat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiverDemo {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket(6666);

        while(true){
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);
            datagramSocket.receive(datagramPacket);
            byte[] data = datagramPacket.getData();
            String msg = new String(data, 0, datagramPacket.getLength());
            System.out.println(msg);
            if(msg.equals("bye")){
                break;
            }

        }
        datagramSocket.close();


    }
}
