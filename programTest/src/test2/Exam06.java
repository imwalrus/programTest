package test2;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Exam06 {
	public static void main(String[] args) {

		List<Employee> list = Arrays.asList( //
				new Employee(1, "Hong", "20-01-01", "PURCHASING", 3500), //
				new Employee(2, "Hwang", "19-01-01", "IT_PROG", 4500), //
				new Employee(3, "Park", "20-01-01", "IT_PROG", 3500), //
				new Employee(4, "Lee", "18-01-01", "MARKETING", 5500), //
				new Employee(5, "Choi", "18-03-01", "IT_PROG", 5000), //
				new Employee(6, "Choo", "20-11-01", "SALES", 2500));

		OptionalDouble avg = list.stream() //
				.filter(s -> s.getDept() == "IT_PROG") //
				.mapToInt((t) -> t.getSalary()) //
				.average();
		System.out.println("IT부서 평균급여: " + avg.orElse(0.0));
	}
}