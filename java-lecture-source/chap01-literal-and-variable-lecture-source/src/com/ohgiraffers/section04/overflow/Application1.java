package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args) {
        /* 오버플로우에 대해 이해할 수 있다. */

        /* 1. 오버플로우 */
        byte num1 = 127;
        System.out.println("num1 : "+ num1);    // 127 : byte의 최대 저장 범위

        num1++; //1 증가

        System.out.println("num1 : "+ num1);    // -128 : byte의 최소 저장 범위

        /* 2. 언더플로우
        * 오버플로우의 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상 */
        byte num2 = -128;
        System.out.println("num2 : " + num2);   // -128 : byte의 최소 저장 범위

        num2--; //1 감소

        System.out.println("num2 : " + num2);

        /* 오버플로우나 언더플로우는 컴파일 에러를 발생시키지 않으므로 최대값 최소값 범위를 고려하여
        * 변수의 자료형을 사용하여야 한다. */

        int firstNum = 1000000;     // 100만
        int secondNum = 700000;     // 70만

        int multi = firstNum * secondNum;   // 7천억 예상

        System.out.println("multi : " + multi);

        /* 오버플로우를 예측하고 더 큰 자료형으로 결과 값을 처리하려 했으나 이미 오버플로우 된 결과가 담겼다.
        * 계산이 처리 되기 전에 long 타입으로 자료형을 변경해주어야 한다. (강제 형변환) */
        //long longMulti = firstNum * secondNum;
        long longMulti = (long) firstNum * secondNum;
        System.out.println("longMulti : " + longMulti);

    }
}