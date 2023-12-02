package com.ohgiraffers.section07.kindsofvariable;

public class KindsOfVariable {

    /* 다양한 변수를 이해하고 사용할 수 있다. */

    /* non-static field를 인스턴스 변수라고 한다. (인스턴스 생성 시점에 사용 가능한 변수라는 의미) */
    private int globalNum;
    /* static field를 클래스 변수(정적 필드)라고 한다. (정적 메모리 영역에 생성 되는 변수라는 의미) */
    private static int staticNum;

    public void method(int num) {

        int localNum;

        // 매개변수는 호출 시 값이 전달 되므로 별도의 값 대입은 필요 없다.
        System.out.println("num : " + num);
        // 지역 변수는 선언 외에 다시 사용하기 위해서는 반드시 초기화 되어야 한다.
        //System.out.println("localNum : " + localNum);

        System.out.println("globalNum : " + globalNum);
        System.out.println("staticNum : " + staticNum);
    }

    public void method2() {
        // 지역 변수는 해당 지역(블럭 내)에서만 사용 가능하다.
        //System.out.println("localNum : " + localNum);
        System.out.println("globalNum : " + globalNum);
        System.out.println("staticNum : " + staticNum);
    }

}
