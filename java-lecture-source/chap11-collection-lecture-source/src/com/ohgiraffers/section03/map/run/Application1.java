package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* HashMap을 이해하고 활용할 수 있다.*/

        HashMap hmap = new HashMap();

        /* 키와 값을 쌍으로 저장한다.
        * 키와 값은 반드시 객체여야 한다. */
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println("hmap : " + hmap);

        /* 키 값은 중복 저장 할 수 없다. 최근 키의 값으로 덮어쓰기 된다. */
        hmap.put(12, "yellow banana");

        System.out.println("hmap : " + hmap);

        /* 값 객체는 중복 저장 할 수 있다. */
        hmap.put(9, "yellow banana");
        hmap.put(11, "yellow banana");

        System.out.println("hmap : " + hmap);

        /* 값 객체의 내용을 가져올 때 */
        System.out.println("키 9에 대한 객체 : " + hmap.get(9));

        /* 키 값을 가지고 삭제를 처리할 때 */
        hmap.remove(9);
        System.out.println("hmap : " + hmap);

        /* 저장 된 객체 수를 확인할 때 */
        System.out.println("hmap에 저장 된 객체 수 : " + hmap.size());

        /* 문자열 키와 문자열 값을 가지는 HashMap 생성 */
        HashMap<String, String> hmap2 = new HashMap<>();

        hmap2.put("one", "java");
        hmap2.put("two", "oracle");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html");
        hmap2.put("five", "css");

        /* 1. keySet()을 이용해 키만 따로 set으로 만들고 iterator로 키에 대한 목록을 만든다. */
        Iterator<String> keyIter = hmap2.keySet().iterator();

        while(keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key + " = " + value);
        }

        /* 2. 저장 된 value 객체들만 values()로 Collection으로 만든다. */
        Collection<String> values = hmap2.values();

        /* 2-1. iterator() 로 목록 만들어서 처리 */
        Iterator<String> valueIter = values.iterator();
        while(valueIter.hasNext()) {
            System.out.println("value : " + valueIter.next());
        }

        /* 2-2. 배열로 만들어서 처리 */
        Object[] valueArr = values.toArray();
        for(int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " : " + valueArr[i]);
        }

        /* 3. Map의 내부 클래스인 EntrySet을 이용 : entrySet() */
        Set<Map.Entry<String, String>> set = hmap2.entrySet();

        Iterator<Map.Entry<String, String>> entryIter = set.iterator();

        while(entryIter.hasNext()) {
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
