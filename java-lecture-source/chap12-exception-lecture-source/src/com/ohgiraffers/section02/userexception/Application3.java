package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application3 {

    public static void main(String[] args) {
        /* multi catch 블럭으로 동일한 레벨의 다른 타입의 예외를 하나의 catch 블럭으로 처리할 수 있다. */
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(20000, 10000);
        } catch (PriceNegativeException | MoneyNegativeException e) {
            /* getClass()로 발생한 예외 클래스의 이름을 알 수 있다. */
            System.out.println(e.getClass() + "발생!");
            /* getMessage()로 발생한 예외의 메세지를 알 수 있다. */
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            /* 예외 클래스명, 예외 발생 위치, 예외 메세지 등을 
            stack 호출 역순으로 빨간 글씨를 이용해서 로그 형태로 출력해 주는 기능 */
            e.printStackTrace();
        } finally {
            System.out.println("예외 발생 여부와 무관하게 finally 블럭 동작");
        }

        System.out.println("프로그램 정상 종료");
    }
}
