package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        /* File 클래스의 사용 용법을 이해할 수 있다. */

        /* JDK 1.0부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스이다.
        * 대상 파일에 대한 정보로 인스턴스를 생성하고 파일의 생성, 삭제 등의 처리를 수행하는 기능을 제공하고 있다. */

        /* 파일 클래스를 이용해서 인스턴스를 생성한다.
        * 대상 파일이 존재하지 않아도 인스턴스를 생성할 수 있다. */
        File file = new File("test.txt");

        try {
            /* 파일 생성 후 성공 실패 여부를 boolean으로 리턴한다. */
            boolean createSuccess = file.createNewFile();
            /* 최초 실행 시에는 파일이 새롭게 만들어지므로 true를 반환하지만
            * 파일이 한 번 생성 된 이후는 새롭게 파일을 만들지 않으므로 false를 반환한다. */
            System.out.println("createSuccess : " + createSuccess);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("파일의 크기 : " + file.length());
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("파일의 상위 경로 : " + file.getParent());
        System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());

        /* 파일 삭제 후 성공 여부를 boolean으로 반환 */
        boolean deleteSuccess = file.delete();

        System.out.println("deleteSuccess : " + deleteSuccess);
    }
}
