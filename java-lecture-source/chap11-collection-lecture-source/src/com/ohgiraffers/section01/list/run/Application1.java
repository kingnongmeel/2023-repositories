package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {
        /* ArrayList
        * ArrayList는 배열의 단점을 보완하기 위해 만들어졌다.
        * 배열은 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬 등이 복잡하다.
        * 이러한 기능들을 ArrayList에서는 미리 메소드로 구현해서 제공하고 있으며
        * 자동적으로 수행 되는 것이지 속도가 빨라지는 것은 아니다.
        * */

        /* ArrayList는 인스턴스를 생성하면 내부적으로 10칸짜리 배열을 생성해서 관리한다. */
        ArrayList alist = new ArrayList();

        /* 다형성을 적용하여 상위 레퍼런스로 ArrayList 객체를 참조할 수 있다.
        * List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에 레퍼런스 타입은 List로 해두는 것이 더 유연한 코드를
        * 작성하는 방법이다.
        * */
        List list = new ArrayList();

        /* 더 상위 타입인 Collection 타입을 사용할 수도 있다. */
        Collection clist = new ArrayList();

        /* 저장 순서가 유지되며 index(순번)이 적용된다.
        * Object 클래스의 하위 타입 인스턴스를 모두 저장할 수 있다. */
        alist.add("apple");
        alist.add(123);         //기본 자료형이 아닌 래퍼 클래스 타입으로 저장 됨 (AutoBoxing)
        alist.add(45.67);
        alist.add(new Date());

        /* toString() 메소드가 오버라이딩 되어 있어 담긴 요소들을 확인할 수 있다.
        * 또한 저장 순서가 유지 되어 있는 것을 확인할 수 있다. */
        System.out.println("alist : " + alist);

        /* size() 메소드는 배열의 크기가 아닌 요소의 개수를 반환한다.
        * 내부적으로 관리되는 배열의 사이즈는 외부에서 알 필요가 없으므로 기능으로 제공하지 않는다. */
        System.out.println("alist의 size : " + alist.size());

        /* 내부 배열에 인덱스가 지정 되어 있기 때문에 for문 접근 가능하다. */
        for(int i = 0; i < alist.size(); i++) {
            /* 인덱스에 해당하는 값을 가져올 때는 get() 메소드 사용 */
            System.out.println(i + " : " + alist.get(i));
        }

        /* ArrayList는 데이터의 중복 저장을 허용한다.
        * 배열과 같이 인덱스로 요소를 관리하기 때문에 가능하다. */
        alist.add("apple");
        System.out.println("alist : " + alist);

        /* 원하는 인덱스 위치에 값을 추가할 수 있다.
        * 덮어쓰기가 아니라 이후 인덱스는 하나씩 뒤로 밀리게 된다.
        * */
        alist.add(1, "banana");
        System.out.println("alist : " + alist);

        /* 저장 된 값을 삭제할 때는 remove() 메소드를 사용한다.
        * 중간 인덱스의 값을 삭제하는 경우 자동으로 인덱스를 하나씩 앞으로 당긴다.
        * */
        alist.remove(2);
        System.out.println("alist : " + alist);

        /* 지정 된 위치의 값을 수정할 때에도 인덱스를 활용하며 set() 메소드를 사용한다. */
        alist.set(1, Boolean.valueOf(true));
        System.out.println("alist : " + alist);

        /* 모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 작성 되어 있다. */
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");
        /* 제네릭 타입을 지정하면 지정한 타입 외의 인스턴스는 저장하지 못함 */
        //stringList.add(123);

        System.out.println("stringList : " + stringList);

        /* 저장 순서를 유지하고 있는 stringList를 오름차순 정렬한다.
        * Collection 인터페이스가 아닌 Collections 클래스를 사용한다.
        * Collection에서 사용 되는 기능들을 static 메소드들로 구현한 클래스이다. */
        Collections.sort(stringList);
        
        /* sort 메소드를 사용하면 list가 오름차순 정렬 된 후 정렬 상태가 유지 된다. */
        System.out.println("stringList : " + stringList);

        /* LinkedList에 정의 된 역순 정렬을 활용해본다.
        * 현재의 ArrayList 객체를 LinkedList 객체로 변경한다. */
        stringList = new LinkedList<>(stringList);

        /* LinkedList로 다운캐스팅 한 뒤 descendingIterator() 메소드를 사용하면 내림차순으로 정렬 된 Iterator 타입의 목록을 반환한다.
        *
        * Iterator란?
        * 컬렉션에서 값을 읽어오는 방식을 통일 된 방식으로 제공하기 위해 사용하는 클래스이다.
        * 반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용한다.
        * 인덱스로 관리 되지 않는 컬렉션도 반복문을 사용하기 위해 제공되고 있다.
        * hasNext() : 다음 요소를 가지고 있으면 true, 더 이상 요소가 없으면 false
        * next() : 다음 요소 반환
        * */
        Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator();

//        while(dIter.hasNext()) {
//            System.out.println(dIter.next());
//        }
        /* 한 번 꺼내서 사용하면 다시 꺼내서 사용할 수 없다. */
//        while(dIter.hasNext()) {
//            System.out.println(dIter.next());
//        }

        /* 역순으로 정렬 된 결과를 저장하기 위해서는 새로운 ArrayList를 만들어서 저장해둔다. */
        List<String> descList = new ArrayList<>();

        while(dIter.hasNext()) {
            descList.add(dIter.next());
        }

        System.out.println("descList : " + descList);

    }
}











