package com.ohgiraffers.section02.userexception;

import java.io.IOError;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {
        /* 사용자 정의 예외 클래스 정의 후 발생한 사용자 정의 예외를 처리할 수 있다. */

        /* 사전에 정의 된 예외 클래스 외에 개발자가 원하는 명칭의 예외 클래스를 작성하는 것이 가능하다.
        * extends Exception으로 예외 처리 클래스를 상속 받아 더 구체적인 예외 이름을 정의하는 것이다.
        * */

        ExceptionTest et = new ExceptionTest();

        try {
            /* 상품 가격보다 가진 돈이 적은 경우 */
            //et.checkEnoughMoney(50000, 30000);

            /* 상품 가격이 음수인 경우 */
            //et.checkEnoughMoney(-50000, 50000);

            /* 가진 돈이 음수인 경우 */
            //et.checkEnoughMoney(50000, -60000);

            /* 정상적으로 구매 가능한 돈을 가진 경우 */
            et.checkEnoughMoney(30000, 50000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("프로그램을 종료합니다.");

    }
}
