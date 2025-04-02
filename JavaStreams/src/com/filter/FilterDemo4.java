package com.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo4 {

	public static void main(String[] args) {
		List<String> li=Arrays.asList("cup",null,"forest","java",null,"stream");
		
		List<String> res=li.stream().filter(w->w!=null).collect(Collectors.toList());
		
		System.out.println(res);
	}
}
