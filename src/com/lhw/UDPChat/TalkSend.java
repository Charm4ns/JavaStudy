package com.lhw.UDPChat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class TalkSend implements Runnable{
    DatagramSocket socket = null;
    BufferedReader reader = null;
    private int toPort;
    private String toIP;
    private int fromPort;

    public TalkSend(int toPort, String toIP, int fromPort) {
        this.toPort = toPort;
        this.toIP = toIP;
        this.fromPort = fromPort;
        try {
            socket = new DatagramSocket(fromPort);
            reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void run(){
        while(true){
            try {
                String data = reader.readLine();
                byte[] bytes = data.getBytes();
                DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, new InetSocketAddress(this.toIP, this.toPort));
                socket.send(packet);
                if(data.equals("bye")){
                    break;
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            socket.close();
        }
    }
}
