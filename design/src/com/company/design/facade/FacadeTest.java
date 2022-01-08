package com.company.design.facade;

public class FacadeTest
{
    public static void main(String[] args)
    {
        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22,"home/etc","text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
    }
}
