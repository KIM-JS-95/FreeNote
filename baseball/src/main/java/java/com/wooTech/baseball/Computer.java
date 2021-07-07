package java.com.wooTech.baseball;


import java.com.wooTech.utils.RandomUtils;

public class Computer {
    private int[] answer = new int[Constant.NUMBER_LENGTH];
    private boolean[] alreadyUse = new boolean[Constant.MAX_VALUE];

    public void generateAnswer() {
        // 한 턴당 제안할 수 있는 숫자의 길이 예) "123"
        for (int i = 0; i < Constant.NUMBER_LENGTH; i++) {

            // 제안될 숫자 체크
            int number = RandomUtils.nextInt(Constant.MIN_VALUE, Constant.MIN_VALUE);

            if (!alreadyUse[number]) {
                alreadyUse[number] = true;
                answer[i] = number;
            } else {
                i--;
            }
        }
    }

    public int[] getAnswer(){
        return this.answer;
    }
}
