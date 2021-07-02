package kr.co.Lec_1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StudentTest {
public static void main(String[] args){
    List<Student> totalList = Arrays.asList(
            new Student("aaaa", 10, Student.Sex.MALE),
    new Student("bbbb", 6, Student.Sex.FEMALE),
    new Student("cccc", 10, Student.Sex.MALE),
    new Student("dddd", 10, Student.Sex.FEMALE)
    );

    List<Student> maleList = totalList.stream()
            .filter(s->s.getSex() == Student.Sex.MALE)
            .collect(Collectors.toList());

    maleList.stream()
            .forEach(s-> System.out.println(s.getName()));

}
}