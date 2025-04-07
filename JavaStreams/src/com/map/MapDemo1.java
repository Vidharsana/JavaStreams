package com.map; 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,2,3,4,5);
		List<Integer> res = new ArrayList<Integer>();
		
		res = li.stream().map(n->n+5).collect(Collectors.toList());
		System.out.println(res);
	}
}
