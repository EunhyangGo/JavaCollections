package com.biz.collects.set;

import java.util.Set;
import java.util.TreeSet;

public class Set03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Treeset을 사용해서하면 데이터가 중복되지 않는다.
		Set<Integer> intSet = new TreeSet();
		for(int i = 0; i <10; i++) {
			int intNum =(int)(Math.random()*(100+1));
			intSet.add(intNum);
		}
		System.out.println(intSet);
	}

}
