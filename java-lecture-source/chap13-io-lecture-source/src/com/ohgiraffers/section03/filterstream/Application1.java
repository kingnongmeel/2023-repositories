package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application1 {

    public static void main(String[] args) {
        /* BufferedWriter와 BufferedReader에 대해 이해하고 사용할 수 있다. */
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("testBuffered.txt"));

            bw.write("안녕하세요\n");
            bw.write("반갑습니다\n");

            /* 버퍼를 이용하는 경우 버퍼가 가득차면 자동으로 내보내기를 하지만 버퍼가 가득 차지 않은 상태에서는
             * 강제로 내보내기를 해야 한다.
             * flush() 라는 메소드를 사용하면 내보내기 처리가 된다. */
            // bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(bw != null) {
                try {
                    /* close() 를 호출하면 내부적으로 flush() 를 하고 나서 자원을 반납한다. */
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* 버퍼에 미리 읽어온 후 한 줄 단위로 읽어오는 기능을 제공하며 기본 스트림보다 성능을 개선 시킨다. */
        try (BufferedReader br = new BufferedReader(new FileReader("testBuffered.txt"))) {

            /* readLine() 을 추가로 제공한다.
            * 버퍼의 한 줄을 읽어와서 문자열로 반환하며 더 이상 읽어올 값이 없을 경우 null이 반환 된다. */
            String temp;
            while((temp = br.readLine()) != null) {
                System.out.println(temp);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
