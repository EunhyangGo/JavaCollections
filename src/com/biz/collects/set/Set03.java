package com.biz.collects.set;

import java.util.Set;
import java.util.TreeSet;

public class Set03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Treeset�� ����ؼ��ϸ� �����Ͱ� �ߺ����� �ʴ´�.
		Set<Integer> intSet = new TreeSet();
		for(int i = 0; i <10; i++) {
			int intNum =(int)(Math.random()*(100+1));
			intSet.add(intNum);
		}
		System.out.println(intSet);
	}

}
