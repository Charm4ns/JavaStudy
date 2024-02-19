package com.lhw.UDPChat;

public class TalkStudent {
    public static void main(String[] args) {
        new Thread(new TalkSend(9999, "localhost", 7777)).start();
        new Thread(new TalkReceive(8888, "老师")).start();
    }
}
