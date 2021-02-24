package kr.co.Lec_3_Thread;

import java.awt.*;


public class ThreadTest {
        public static void main(String[] args) {
            Thread1 t1 = new Thread1();
            Thread1 t2 = new Thread1();


            // 1. 번갈아가면서 나옴(run)
            t1.run();
            t2.run();


            // 2. 동시에 똑같은 숫자가 나오고(start)
        t1.start();
        t2.start();

        }
}

