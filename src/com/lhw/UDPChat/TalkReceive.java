package com.lhw.UDPChat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TalkReceive implements Runnable{
    DatagramSocket socket = null;
    private int port;
    private String msgfrom;

    public TalkReceive(int port, String msgfrom) {
        this.port = port;
        this.msgfrom = msgfrom;
        try {
            socket = new DatagramSocket(port);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void run(){
        while(true){
            try {
                byte[] bytes = new byte[1024];
                DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length);
                socket.receive(packet);
                byte[] data = packet.getData();
                String msg = new String(data, 0, packet.getLength());
                System.out.println(msgfrom + ":" + msg);
                if(msg.equals("bye")){
                    break;
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
