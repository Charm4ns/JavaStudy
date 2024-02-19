package com.lhw.UDPChat;

public class TalkTeacher {
    public static void main(String[] args) {
        new Thread(new TalkSend(8888, "localhost", 5555)).start();
        new Thread(new TalkReceive(9999, "学生")).start();
    }
}
