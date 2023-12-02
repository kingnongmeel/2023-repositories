package com.ohgiraffers.section03.math;

public class Application1 {

    public static void main(String[] args) {
        /* Math 클래스에서 제공하는 static 메소드를 호출할 수 있다. */

        /* java.lang.Math
        * 수학에서 자주 사용 되는 상수들과 함수들을 미리 구현해 놓은 클래스로
        * 모든 메소드는 static 메소드로 작성 되어 있다.
        * */

        /* 1. 절대값 출력
        * 클래스의 full name 작성 */
        System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));

        /* import를 해서 사용
        * java.lang 패키지 하위의 기능은 매우 자주 사용 되는 기능들이 있기 때문에
        * 컴파일러가 자동으로 import java.lang.*; 코드를 추가한다.
        * 따라서 별도로 import 할 필요가 없다.
        * */
        System.out.println("-1.25의 절대값 : " + Math.abs(-1.25));

        /* 2. 최대값, 최소값 출력 */
        System.out.println("10과 20중 더 작은 값? : " + Math.min(10, 20));
        System.out.println("10과 20중 더 큰 값? : " + Math.max(10, 20));

        /* 3. 원주율 */
        System.out.println("원주율 : " + Math.PI);

        /* 4. 난수 출력
        * 0부터 1 미만의 실수 형태의 난수를 발생시킨다.
        * 호출 시마다 다른 값을 가진다.
        * */
        System.out.println("난수 발생 : " + Math.random());

    }
}






