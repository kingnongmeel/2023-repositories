package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    /* 클래스 선언부에 extends Car를 추가해서 Car 클래스를 상속 받는다.
    * 그러면 FireCar는 Car의 모든 멤버(필드, 메소드)를 상속 받을 수 있다.
    * 단, 생성자는 상속 받지 못한다.
    * 또한 부모의 private 멤버는 접근이 불가능하다.
    * */

    public FireCar() {
        /* 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동으로 추가한다.
        * 부모의 기본 생성자를 호출하는 구문이다.
        * 명시적 or 묵시적으로 사용 가능하다. */
        super();
        System.out.println("FireCar 클래스의 기본 생성자 호출...");
    }

    /* soundHorn() 오버라이딩 */

    /* @Override 어노테이션
     * JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립 되지 않는 경우 컴파일 에러를 발생시킨다.
     * 오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 한다.
    * */
    @Override
    public void soundHorn() {
        if(isRunning()) {
            /* runningStatus는 private 필드이므로 접근 불가능
            * 부모의 isRunning() 메소드를 통해서만 주행 중인 상태임을 확인할 수 있으므로 private -> protected로 변경
            * Car 클래스의 runningStatus를 protected로 변경하여 직접 접근 할 수 있지만 권장 되지 않음(캡슐화 위배)
            * this.isRunning() or super.isRunning() 둘 다 사용 가능하며 컴파일러는 기본적으로 this.를 추가
            * (super. 를 명시적으로 써야 하는 상황도 있음)
            * */
            System.out.println("빠아아아아앙~~!!!빠아아아아앙~~!!");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다~ 비키세요~");
        }
    }

    /* 상속은 확장이다. FireCar만의 추가적인 기능도 작성할 수 있다. */
    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다 ==========================>>>");
    }

}











