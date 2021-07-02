package kr.co.Lec_3_Thread;

import java.awt.*;

public class ThreadTest2 {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            System.out.println("1");
            try{
                Thread.sleep(1000);

            }catch (Exception e){}
        }

    }
}
