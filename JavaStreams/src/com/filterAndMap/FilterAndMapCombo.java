package com.filterAndMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}
public class FilterAndMapCombo {

	public static void main(String[] args) {
		List<Employee> empli = Arrays.asList(
				new Employee(101,"Aaa",10000),
				new Employee(102,"Bbb",20000),
				new Employee(103,"Ccc",30000),
				new Employee(104,"Ddd",40000),
				new Employee(105,"Eee",50000)
				);
		List<Integer> empList = empli.stream().filter(e->e.salary>20000).map(e->e.salary).collect(Collectors.toList());
		System.out.println(empList);
	}
}
