package com.ohgiraffers.section01.exception;

public class Application3 {

    public static void main(String[] args) {
        /* try catch 블럭을 이용하여 예외 처리를 할 수 있다. */
        ExceptionTest et = new ExceptionTest();

        try {
            /* try 블럭에는 예외 발생 가능성이 있는 코드를 호출한다. */
            et.checkEnoughMoney(50000, 10000);

            /* 위의 메소드 호출 시 예외가 발생하지 않는 경우 이후 내용은 마저 실행 된다. */
            System.out.println("========== 상품 구입 가능 ==========");
        } catch (Exception e) {

            /* try 블럭에서 예외 발생 시 catch 블럭의 코드가 실행 된다.
            * 이 때 예외 발생 위치 하단의 코드는 동작하지 않는다. */
            System.out.println("========== 상품 구입 불가 ==========");
        }

        System.out.println("프로그램을 종료합니다.");

        /* try catch 블럭을 이용하면 exception이 발생하더라도
        * 다시 프로그램의 정상 흐름으로 돌아오도록 예외 처리가 된다. */
    }
}
