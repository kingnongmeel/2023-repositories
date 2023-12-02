package com.ohgiraffers.section01.intro;

public class Application2 {

    public static void main(String[] args) {
        /* 람다식 활용을 위한 내부 인터페이스 관리 기법에 대해 이해할 수 있다.
        * 람다식 사용을 위해 인터페이스 내에 하나의 추상 메소드만 작성할 수 있기 때문에
        * 관리해야 하는 인터페이스가 너무 많아질 수 있다.
        * 이 때 내부 인터페이스를 활용할 수 있다. */

        OuterCalculator.Sum sum = (x, y) -> x + y;
        OuterCalculator.Minus minus = (x, y) -> x - y;
        OuterCalculator.Multiple multiple = (x, y) -> x * y;
        OuterCalculator.Devide devide = (x, y) -> x / y;

        System.out.println(sum.sumTwoNumber(20, 10));
        System.out.println(minus.minusTwoNumber(20, 10));
        System.out.println(multiple.multiplyTwoNumber(20, 10));
        System.out.println(devide.devideTwoNumber(20, 10));
    }
}
