package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
        /* 스캐너 사용 시 주의사항에 대해 이해하고 고려하여 사용할 수 있다. */
        /* 스캐너의 next 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
         * 그래서 크게 두 가지 사항을 주의해야 한다.
         * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때
         * 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열 입력받을 때
         * */
        /* 스캐너 객체 생성 */
        Scanner sc = new Scanner(System.in);
        /* 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때 */
        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.next(); //공백이나 개행문자 전 까지를 읽어온다.
        System.out.println("str1 : " + str1);
        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt(); //정수 값을 읽어온다.
        System.out.println("num1 : " + num1);
        /* 공백을 포함한 문자열을 입력하게 되면 입력 버퍼에 남아있는 문자열로 인해 nextInt() 메소드가 해당 값을
        * 숫자로 변경하지 못해서 InputMismatchException 이 발생할 수 있는 가능성이 있다.
        * => 공백이 있는 문자열을 입력 받아야 할 경우에는 next가 아닌 nextLine 사용하기 */

        /* 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열 입력받을 때 */
        System.out.print("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 : " + num2);

        sc.nextLine(); // 버퍼를 비운다.

        System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");
        String str2 = sc.nextLine();
        System.out.println("str2 : " + str2);

        /* 입력 버퍼에 남아있는 개행문자로 인해 이어지는 nextLine()이 아무 값도 입력 받지 않고 빈 문자열로 처리 된다.
        * => 입력 버퍼에 남은 개행문자를 사전에 읽고 버린다. */
    }
}
