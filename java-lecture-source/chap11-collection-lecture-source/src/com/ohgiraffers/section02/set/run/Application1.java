package com.ohgiraffers.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {

    public static void main(String[] args) {
        /* HashSet 클래스를 이해하고 사용할 수 있다. */
        HashSet<String> hset = new HashSet<>();

        /* 다형성 적용하여 상위 인터페이스를 타입으로 사용 가능 */
        Set<String> hset2 = new HashSet<>();
        Collection<String> hset3 = new HashSet<>();

        /* Set 계열에 데이터 추가 시 add 메소드 사용 */
        hset.add(new String("java"));
        hset.add(new String("oracle"));
        hset.add(new String("jdbc"));
        hset.add(new String("html"));
        hset.add(new String("css"));

        /* 저장 순서가 유지되고 있지 않다. */
        System.out.println("hset : " + hset);

        hset.add(new String("java"));

        /* 중복 값이 저장 되지 않는다.
        * 동일 객체(주소 값 일치)뿐만 아니라 동등 객체(필드 값 일치)도 중복 값으로 판단 되어 처리 된다.
        * String 클래스에 equals()와 hashCode() 메소드가 오버라이딩 되어 있기 때문이다. */
        System.out.println("hset : " + hset);
        /* contains() 메소드는 해당 객체를 포함하고 있는지 확인하는 메소드로 여기에서도 동등 객체로 판단한다.
        * 내부적으로 equlas() 메소드를 사용한다. */
        System.out.println("포함 여부 확인 : " + hset.contains(new String("oracle")));

        /* 저장 된 객체를 하나씩 꺼내는 기능이 없다.
        * 반복문을 이용한 연속 처리 방법으로는
        * 1. toArray() 메소드로 배열로 변경 한 뒤 for loop 사용
        * 2. iterator() 메소드로 반복자를 만들어 연속 처리
        * */
        Object[] arr = hset.toArray();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }

        Iterator<String> iter = hset.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }



    }
}
