package com.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filterdemo2 {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(102,157,203,254,30);
		List<Integer> evenNumList=new ArrayList<Integer>();
		
		//numList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		numList.stream().filter(n->n%2==0).forEach(System.out::println);
		
	}
}
