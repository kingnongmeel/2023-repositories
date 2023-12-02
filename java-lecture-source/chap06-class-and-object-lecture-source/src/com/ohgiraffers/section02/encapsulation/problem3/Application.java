package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
        /* 필드에 직접 접근 시 발생하는 문제를 해결하는 방법을 이해하고 적용할 수 있다. */

        /* Monster 클래스의 필드를 name -> kinds로 변경하면 setInfo 메소드와 getInfo 메소드는 변경해야 한다.
        * 하지만 사용자(클라이언트)의 호출 코드는 변경하지 않아도 된다.
        * 따라서 유지보수성이 향상된다. */
        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setInfo("늑대인간");
        monster2.setHp(200);

        Monster monster3 = new Monster();
        monster3.setInfo("미이라");
        monster3.setHp(300);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());

        /* ------------------------------------------- */
        monster3.kinds = "두치";
        monster3.hp = -200;
        System.out.println("monster3 kinds : " + monster3.kinds);
        System.out.println("monster3 hp : " + monster3.hp);
        // => 메소드로 간접접근 하는 방법은 만들었지만 여전히 직접접근이 가능하므로 직접접근을 못하도록 강제화하는 처리를 추가한다.
    }
}
