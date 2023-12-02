package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;

public class Application2 {

    public static void main(String[] args) {
        /* LinkedHashSet에 대해 이해하고 사용할 수 있다.
        * HashSet이 가지는 기능을 모두 가지고 있으며 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
        * JDK 1.4부터 제공
        * */

        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        /* 저장 순서를 Link를 통해 유지하고 있는 것 확인 */
        System.out.println("lhset : " + lhset);
    }
}
