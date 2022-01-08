package com.company.design.noFacade;

public class noFacadeTest
{
    public static void main(String[] args) {

        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.fileWrite();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();


        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disconnect();
    }
}
