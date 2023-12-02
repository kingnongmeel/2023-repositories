package com.ohgiraffers.section01.extend;

public class Application {

    public static void main(String[] args) {
        /* 1. Car 인스턴스 생성 후 호출 */
        Car car = new Car();

        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        /* 상속을 적용시킨 클래스 작성
        * 소방차, 레이싱카는 모두 자동차이다.
        * FireCar is a Car (O) / Car is a FireCar (X)
        * RacingCar is a Car (O) / Car is a RacingCar (X)
        * => IS-A 관계가 성립하는 경우 상속을 사용할 수 있다.
        * */

        /* 2. FireCar 인스턴스 생성 후 호출 */
        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();

        /* FireCar 클래스에는 아무것도 작성하지 않아도 Car 클래스의 메소드를 모두 사용할 수 있다.
        * 단, private 멤버는 접근이 불가능하다. */
//        fireCar.runningStatus;
//        fireCar.isRunning();

        /* 상속은 부모가 가진 멤버를 사용하면서 확장이 가능하다.
        * 자식은 부모 멤버에 접근해서 자신의 것처럼 사용 가능하지만, 반대의 경우는 허용하지 않는다. */
        fireCar.sprayWater();
        //car.sprayWater();

        /* 3. RacingCar 인스턴스 생성 후 메소드 호출 */
        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();

        /* 레이싱카에는 경적 소리를 내는 것이 적합하지 않다.
        * 하지만 Car를 상속 받았기 때문에 RacingCar도 어쩔 수 없이 경기장에서 경적을 울리게 된다.
        * 상속으로 인해 불필요한 기능이 추가 될 수도 있다.
        * */
    }
}
