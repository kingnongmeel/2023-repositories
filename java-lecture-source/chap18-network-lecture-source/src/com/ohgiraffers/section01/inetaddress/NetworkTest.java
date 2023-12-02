package com.ohgiraffers.section01.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkTest {

    public static void main(String[] args) {
        /* InetAddress 클래스의 메소드를 사용할 수 있다. */
        try {

            InetAddress localIP = InetAddress.getLocalHost();
            System.out.println(localIP.getHostAddress());
            System.out.println(localIP.getHostName());

            InetAddress naverIP = InetAddress.getByName("www.naver.com");
            System.out.println("네이버 서버 ip : " + naverIP.getHostAddress());

            InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
            for(InetAddress ip : naverIPs) {
                System.out.println(ip.getHostAddress());
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }


    }
}
