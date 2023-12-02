package com.ohgiraffers.section03.copy;

public class Application4 {
    public static void main(String[] args) {
        /* 향상 된 for문을 이해하고 활용할 수 있다. */

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();

        /* for문을 이용해 인덱스에 값을 10씩 누적 증가 */
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] += 10;
        }

        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        /* 향상 된 for문 : jdk 1.5 버전부터 추가 된 문법
        * 배열 인덱스에 하나로 차례로 접근해서 담긴 값을 임시로 사용할 변수에 담고 반복문을 실행한다.
        * */
        for(int i : arr2) {
            i += 10;
        }

        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        /* 향상 된 for문은 배열 인덱스에 차례로 접근할 때는 편하게 사용할 수 있지만 값을 변경할 수는 없다.
        * 인덱스에 접근해서 값을 변경한 것이 아니라 꺼낸 값을 복사해서 사용하고 있기 때문이다.
        * 대신 변경이 아니라 사용이 목적일 경우 더 편리하게 사용할 수 있다.
        * */
        for(int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
