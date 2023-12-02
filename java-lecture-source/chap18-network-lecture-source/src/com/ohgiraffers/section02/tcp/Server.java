package com.ohgiraffers.section02.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {
            /* 포트 번호를 전달하며 서버 소켓 객체 생성 */
            int port = 8500;
            ServerSocket server = new ServerSocket(port);

            while(true) {
                System.out.println("===== 클라이언트의 요청을 기다리고 있습니다. =====");
                Socket client = server.accept();

                System.out.println("클라이언트와 연결 되었습니다.");

                InputStream input = client.getInputStream();
                OutputStream output = client.getOutputStream();

                BufferedReader br = new BufferedReader(new InputStreamReader(input));
                PrintWriter pw = new PrintWriter(output);

                while(true) {
                    String message = br.readLine();
                    if(!message.equals("exit")) {
                        System.out.println("클라이언트가 보낸 메세지 : " + message);
                        pw.println("서버에서 메세지를 수신하였습니다.");
                        pw.flush();
                    } else {
                        System.out.println("클라이언트와의 접속을 종료합니다.");
                        break;
                    }
                }

                br.close();
                pw.close();
                client.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
