package com.ohgiraffers.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {
        int intValue = 20;
        Integer boxingNumber1 = new Integer(intValue); //인스턴스화 - 박싱(Boxing) //생성자 이용
        Integer boxingNumber2 = Integer.valueOf(intValue); //static 메소드 이용
        int unBoxingNumber1 = boxingNumber1.intValue(); //언박싱(UnBoxing) //intValue() 이용
        Integer boxingNumber3 = intValue; //오토 박싱
        int unBoxingNumber2 = boxingNumber3; //오토 언박싱
        /* Wrapper 클래스 값 비교 */
        int inum = 20;
        Integer integerNum1 = new Integer(20);
        Integer integerNum2 = new Integer(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;
        /* 기본 타입과 래퍼클래스 타입은 == 연산으로 비교 가능하다. */
        System.out.println("int와 Integer 비교 : " + (inum == integerNum1)); //true
        System.out.println("int와 Integer 비교 : " + (inum == integerNum3)); //true
        /* 생성자를 이용해 생성한 인스턴스의 경우 ==로 비교하지 못한다.
         * 단 오토 박싱을 이용해서 생성한 값은 ==로 비교가 가능하다. */
        System.out.println("integer와 integer 비교 : " + (integerNum1 == integerNum2)); //false
        System.out.println("integer와 integer 비교 : " + (integerNum1 == integerNum3)); //false
        System.out.println("integer와 integer 비교 : " + (integerNum3 == integerNum4)); //true
        /* 래퍼클래스 타입의 인스턴스를 비교할 때는 equals()를 사용해야 한다. */
        System.out.println("equals() : " + (integerNum1.equals(integerNum2))); //true
        System.out.println("equals() : " + (integerNum1.equals(integerNum3))); //true
        System.out.println("equals() : " + (integerNum3.equals(integerNum4))); //true
    }
}
