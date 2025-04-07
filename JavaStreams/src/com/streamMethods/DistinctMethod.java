package com.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMethod {

	public static void main(String[] args) {
		List<String> li = Arrays.asList("bus","car","train","bus","bus","car","auto");
		List<String> veh = li.stream().distinct().collect(Collectors.toList());
		System.out.println(veh);
	}
}
