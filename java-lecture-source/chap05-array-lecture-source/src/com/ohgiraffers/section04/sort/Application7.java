package com.ohgiraffers.section04.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application7 {
    public static void main(String[] args) {

        /* 숫자 야구게임 만들기
         * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
         * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
         * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
         * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
         *
         * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
         * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
         *
         * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
         * 횟수는 차감하지 않는다.
         *
         * -- 프로그램 예시 (난수 7416 의 경우) --
         *
         * 10회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 1234
         * 아쉽네요 0S 2B 입니다.
         * 9회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 5678
         * 아쉽네요 0S 2B 입니다.
         * 8회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 7416
         * 정답입니다.
         * */
        Scanner sc = new Scanner(System.in);

        int iarr[] = new int[4];
        int input[] = new int[4];
        int sCount = 0;
        int bCount = 0;
        int countDown = 10;

        for(int i = 0; i < iarr.length; i++) {
            iarr[i] = new Random().nextInt(10);
            for(int j = 0; j < i; j++) {
                if(iarr[i] == iarr[j]) {
                    i--;
                    break;
                }
            }
        }

        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        while(true) {
            sCount = 0;
            bCount = 0;
            System.out.println(countDown + "회 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요 : ");
            String str = sc.nextLine();

            if(str.length() != 4) {
                System.out.println("4자리의 정수를 입력해야 합니다.");
            } else {
                countDown--;

                for(int i = 0; i < input.length; i++) {
                    input[i] = (int) (str.charAt(i) - 48);
                    if(iarr[i] == input[i]) {
                        sCount++;
                    }
                }

                for(int i = 0; i < iarr.length; i++) {
                    for(int j = 0; j < iarr.length; j++) {
                        if(input[i] != iarr[i] && iarr[i] == input[j]) {
                            bCount++;
                        }
                    }
                }
            }

            if(sCount == 4) {
                System.out.println("정답입니다.");
                break;
            } else {
                System.out.println("아쉽네요 " + sCount + "S " + bCount + "B 입니다.");
            }

            if(countDown == 0) {
                System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
                break;
            }

        }

    }
}
