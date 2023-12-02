package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void testSimpleIfElseStatement() {
        /* if-else문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 정수 하나를 입력 받아 그 수가 홀수 이면 "입력하신 숫자는 홀수입니다." 라고 출력하고,
        * 홀수가 아니면 "입력하신 숫자는 짝수입니다."라고 출력하는 프로그램을 만들어본다.
        * 단, 조건과 상관 없이 프로그램이 종료 될 때 "프로그램을 종료합니다."라고 출력 되도록 한다.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력 : ");
        int num = sc.nextInt();

        if(num % 2 != 0) {
            System.out.println("입력하신 숫자는 홀수입니다.");
        } else {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }

        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfElseStatement() {
        /* 중첩된 if-else문의 흐름을 이해하고 적용할 수 있다. */

        /* 정수 하나를 입력 받아 그 수가 홀수 이면 "입력하신 숫자는 홀수입니다." 라고 출력하고,
         * 홀수가 아니면 "입력하신 숫자는 짝수입니다."라고 출력하는 프로그램을 만들어본다.
         * 단, 0이면 "0입니다."라고 출력한다.
         * 조건과 상관 없이 프로그램이 종료 될 때 "프로그램을 종료합니다."라고 출력 되도록 한다.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력 : ");
        int num = sc.nextInt();

        if(num != 0){
            if(num % 2 != 0) {
                System.out.println("입력하신 숫자는 홀수입니다.");
            } else {
                System.out.println("입력하신 숫자는 짝수입니다.");
            }
        } else {
            System.out.println("0입니다.");
        }

        System.out.println("프로그램을 종료합니다.");

    }

}
