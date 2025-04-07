package com.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("bus","car","cat","dog","cow");
		List<String> res = new ArrayList<String>();
		
		//names.stream().map(str->str.toUpperCase()).forEach(str->System.out.println(str));
		names.stream().map(str->str.toUpperCase()).forEach(System.out::println);
	}
}
