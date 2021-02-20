package kr.co.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    public enum Sex{MALE, FEMALE}
    public  enum City{Seoul, Pusan}

    private String name;
    private int score;
    private Sex sex;
    private City city;

    public Student(String name, int score, Sex sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public Student(String name, int score, Sex sex, City city) {
        this.name = name;
        this.score = score;
        this.sex = sex;
        this.city = city;
    }


}
