package com.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Vidhu","Tharika","Hemanth","Veena");
		List<String> longNames=new ArrayList<String>();
		
		longNames=names.stream().filter(str->str.length()>6&&str.length()<10).collect(Collectors.toList());
		System.out.println(longNames);
	}
}
