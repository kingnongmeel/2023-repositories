package com.ohgiraffers.section03.grammar;

public class Application1 {
    public static void main(String[] args) {
        /* 1. values() : 열거 타입의 모든 값을 배열로 리턴한다. */
        for(EnumType type : EnumType.values()) {
            System.out.println("type = " + type);
        }

        /* 2. valueOf() : 해당 이름을 가진 열거 타입 상수를 리턴한다. */
        for(EnumType type : EnumType.values()) {
            if(type == EnumType.valueOf("JAVA")) {
                System.out.println("type = " + type);
            }
        }

        /* 3. ordinal() : 열거 타입의 상수의 순서를 리턴한다. */
        System.out.println("ordinal = " + EnumType.ORACLE.ordinal());

        /* 4. name() : 열거 타입의 문자열을 리턴한다. */
        System.out.println("name = " + EnumType.SPRING.name());
        System.out.println("name = " + EnumType.SPRING.toString());
        System.out.println("name = " + EnumType.SPRING);
    }
}
