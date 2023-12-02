package com.ohgiraffers.section02.looping;

public class Application {

    public static void main(String[] args) {
        A_for a = new A_for();
        //a.testSimpleForStatement();
        //a.testForExample1();
        //a.testForExample2();
        //a.testForExample3();
        //a.testForExample4();
        //a.printSimpleGugudan();

        A_nestedFor a2 = new A_nestedFor();
        //a2.printGugudanFromTwoToNine();
        //a2.printStarInputRowTimes();
        //a2.printTriangleStars();

        B_while b = new B_while();
        //b.testSimpleWhileStatement();
        //b.testWhileExample3();

        C_doWhile c = new C_doWhile();
//        c.testSimpleDoWhileStatement();
        c.testDoWhileExample1();
    }
}
