package com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Application2 {

    public static void main(String[] args) {

        /* 순차 정렬에 대해 이해하고 활용할 수 있다. */

        /* 순차정렬이란 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘으로
         * 배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 정렬 알고리즘이다.
         * */

        /* 초기 배열 선언 및 초기화 */
        int[] iarr = {2,5,4,6,1,3};

        /* 배열 첫 인덱스부터 마지막 전 인덱스까지 반복하는 반복문
           마지막 인덱스는 자연스럽게 정렬 되므로 처리할 필요가 없음 */
        for(int i = 0; i < iarr.length - 1; i++){

            /* 비교 대상 인덱스 다음 인덱스부터 마지막 인덱스까지 반복하는 반복문 */
            for(int j = i+1; j < iarr.length; j++){

                /* 오름차순 정렬을 위한 처리
                 * 내림차순은 부등호만 반대로 처리하면 됨
                 **/
                if(iarr[i] > iarr[j]) {
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }

            }
            /* Arrays 클래스의 toString() 메소드에 배열을 전달하면 해당 배열의 요소를 문자열로 만들어 반환 */
            System.out.println(i + "번 인덱스 정렬 완료 : " + Arrays.toString(iarr));
            System.out.println();
        }

        /* 값 출력용 반복문 */
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }

    }
}
