package com.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		List<Integer> li1 = Arrays.asList(10,15,20,25,30);
		List<Integer> li2 = li1.stream().map(n->n+10).collect(Collectors.toList());
		System.out.println(li2);
	}
}
