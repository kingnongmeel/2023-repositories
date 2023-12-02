package com.ohgiraffers.section02.package_and_import;

public class Application1 {

    public static void main(String[] args) {
        /* 패키지에 대해 이해할 수 있다. */
        /* 클래스명은 원래 패키지명을 포함하고 있다.
        * 다른 패키지에 존재하는 클래스를 사용하는 경우에는 클래스명 앞에 패키지명을 명시해서 풀 클래스명으로 사용해야 한다.
        * */
        com.ohgiraffers.section01.method.Calculator cal = new com.ohgiraffers.section01.method.Calculator();
        int min = cal.minNumberOf(30, 20);
        System.out.println("30과 20 중 더 작은 값 ? : " + min);

        int max = com.ohgiraffers.section01.method.Calculator.maxNumberOf(30, 20);
        System.out.println("30과 20 중 더 큰 값 ? : " + max);
    }
}
