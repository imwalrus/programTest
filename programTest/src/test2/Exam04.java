package test2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam04 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList( //
				new Student("Hong", 56, 42), //
				new Student("Hwang", 35, 58), //
				new Student("Lee", 65, 38), //
				new Student("Choi", 51, 32), //
				new Student("Choo", 15, 28), //
				new Student("Park", 50, 50));

		List<Student> students = list.stream() //
				.filter(t -> t.getEng() + t.getMath() < 100) //
				.collect(Collectors.toList());

		for (Student student : students) {
			System.out.println("이름: " + student.getName() + ", 영어점수: " + student.getEng() + ", 수학점수: " + student.getMath());
		}
	}
}
