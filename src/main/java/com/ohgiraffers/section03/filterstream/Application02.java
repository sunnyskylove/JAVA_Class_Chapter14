package com.ohgiraffers.section03.filterstream;

import java.io.*;
import java.nio.Buffer;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. 형변환 보조 스트림에 대해 이해하고 사용할 수 있다. */

        /* 필기.
        *   형변환 보조스트림
        *   기본 스트림이 byte 기반 스트림이고, 보조 스트림이 char 기반 스트림인 경우 사용
        * */

        /* 필기.
        *   표준 스트림
        *   자바에서는 콘솔이나 키보드 같은 표준 입출력 장치로부터 데이터를 입출력 하기 위한
        *   스트림을 제공하고 있다.
        *   System 클래스의 필드 in, out, err 가 대상 데이터에 스트림을 의미한다.
        *   System.in (InputStream) : 콘솔로부터 데이터를 입력 받는다.
        *   System.out (printStream) : 콘솔로부터 데이터를 출력한다.
        *   System.err (PrintStream) : 콘솔로부터 데이터를 출력한다.
        * */

        /* 필기.
        *   System.in 을 InputStreamReader 로 변환하여 바이트 기반 -> 문자 기반으로 변환 후
        *   버퍼를 이용해서 보조스트림이랑 연결
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력을 받은 후에, 보조스트림에다가, 기반스트림을 넣어준다.?????

        try {

            System.out.print("문자열 입력 : ");      // Scanner 입력하면, ▼
            String value = br.readLine();

            System.out.println("value : " + value);  // value 값이 다시 똑같이 출력해준다.


        } catch (IOException e) {
            throw new RuntimeException(e);


        } finally {
            if(br != null){

                try {
                    br.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);

                }

            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            bw.write("java mysql jdbc");         // Scanner(학습용으로만 사용함)를 안써도 내보낼 수 있다.

        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {

            if(bw != null) {

                try {
                    bw.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }

        }

    }

}
