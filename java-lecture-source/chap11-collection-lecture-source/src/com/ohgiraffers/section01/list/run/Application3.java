package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {

    public static void main(String[] args) {
        /* LinkedList에 대해 이해하고 사용할 수 있다.
        * ArrayList가 배열을 이용해서 발생할 수 있는 성능적 단점을 보완하고자 고안되었다.
        * 내부는 이중 연결 리스트로 구현되어 있다.
        * */

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("mango");
        linkedList.add("orange");
        linkedList.add("grape");

        for(int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + " : " + linkedList.get(i));
        }

        linkedList.remove(1);

        for(String s : linkedList) {
            System.out.println(s);
        }

        linkedList.set(0, "pineapple");

        System.out.println(linkedList);

        /* isEmpty() 메소드를 통해 list가 비어있는지 확인할 수 있다. */
        System.out.println(linkedList.isEmpty());

        /* 리스트 내 요소를 모두 제거하는 clear() 메소드를 이용할 수 있다. */
        linkedList.clear();

        System.out.println(linkedList.isEmpty());

        /* LinkedList는 List 인터페이스를 상속 받아 ArrayList와 사용하는 방법이 거의 유사하다.
        * 하지만 내부적으로는 요소를 저장하는 방법에 차이가 있는 것이다.
        * 각 컬렉션 프레임워크 클래스들의 특징을 파악하고 그에 따라 적합한 자료구조를 구현한 클래스를 선택하는 것이 좋다. */
    }
}










