package com.wooTech.baseball;

import java.util.Scanner;

public class BaseballGame {

    private Computer computer;
    private User user;
    private Hint hint;
    private boolean running;
    private Scanner scanner;

    public BaseballGame(Scanner scanner) {
        this.computer = new Computer();
        this.user = new User();
        this.hint = new Hint();
        this.running = true;
        this.scanner = scanner;
    }

    public void start(){
        while(isRestart()){
            computer.generateAnswer();
            startGame();
        }
    }
}
