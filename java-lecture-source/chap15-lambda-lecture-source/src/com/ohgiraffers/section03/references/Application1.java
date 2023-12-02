package com.ohgiraffers.section03.references;

import java.util.function.BiFunction;

public class Application1 {

    public static void main(String[] args) {
        /* 메소드 참조에 대해 이해하고 사용할 수 있다. */
        BiFunction<String, String, Boolean> biFunction;
        String str1 = "METHOD";
        String str2 = "METHOD";
        biFunction = (x, y) -> x.equals(y);
        System.out.println(biFunction.apply(str1, str2));

        /* 위의 람다식을 메서드 참조로 변경 */
        biFunction = String::equals;
        System.out.println(biFunction.apply(str1, str2));
    }
}
