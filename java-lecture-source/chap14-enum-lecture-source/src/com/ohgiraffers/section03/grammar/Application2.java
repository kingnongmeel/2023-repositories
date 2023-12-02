package com.ohgiraffers.section03.grammar;

import java.util.EnumSet;
import java.util.Iterator;

public class Application2 {
    public static void main(String[] args) {
        /* 열거 상수는 열거 객체이므로 생성자를 이용해 열거 상수에 여러 값을 넣을 수 있다. */
        for(FoodsEnum food : FoodsEnum.values()) {
            System.out.println("name=" + food.getName() + ", value=" + food.getValue());
        }

        /* EnumSet을 활용하여 enum을 Set 자료구조로 가져올 수 있다. */

        // 열거 타입 모든 상수 Set에 추가
        EnumSet<FoodsEnum> foods = EnumSet.allOf(FoodsEnum.class);
        Iterator<FoodsEnum> iter = foods.iterator();
        while(iter.hasNext()) {
            FoodsEnum foodsEnum = iter.next();
            System.out.println(foodsEnum + " = " + foodsEnum.getName());
        }

        System.out.println("==============================================");

        // 특정 상수 Set에 추가
        EnumSet<FoodsEnum> twoFoods = EnumSet.of(FoodsEnum.DRINK_WOOLUCK_SMOOTHIE, FoodsEnum.MEAL_BUNGEOPPANG_SUSHI);
        Iterator<FoodsEnum> iter2 = twoFoods.iterator();
        while(iter2.hasNext()) {
            FoodsEnum foodsEnum = iter2.next();
            System.out.println(foodsEnum + " = " + foodsEnum.getName());
        }

        System.out.println("==============================================");

        // 특정 상수만 제외하고 Set에 추가
        EnumSet<FoodsEnum> expectFoods = EnumSet.complementOf(EnumSet.of(FoodsEnum.DRINK_RADISH_KIMCHI_LATTE));
        Iterator<FoodsEnum> iter3 = expectFoods.iterator();
        while(iter3.hasNext()) {
            FoodsEnum foodsEnum = iter3.next();
            System.out.println(foodsEnum + " = " + foodsEnum.getName());
        }
    }
}









