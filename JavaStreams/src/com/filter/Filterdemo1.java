package com.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo1 {

	public static void main(String[] args) {
		/*ArrayList<Integer> numberList=new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(15);
		numberList.add(20);
		numberList.add(25);
		numberList.add(30);*/
		
		
		List<Integer> numList = Arrays.asList(10,15,20,25,30);
		List<Integer> evenNumList=new ArrayList<Integer>();
		
		evenNumList=numList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumList);
	}
}
