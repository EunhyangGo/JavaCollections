package com.biz.collects.list;

import java.util.ArrayList;
import java.util.List;

public class List04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strList = new ArrayList();
		addList(strList);
		
		int intSum = 0;
		int nSize = strList.size();
		for(int i = 0 ; i < nSize; i++) {
			intSum += Integer.valueOf(strList.get(i));
		}
		System.out.println(strList);
		System.out.println("ÇÕ°è: " + intSum);
		
		intSum = 0;//Â¦¼ö¸¸ ÇÕ°è»ê
		for(int i = 0; i < nSize ; i++) {
			int intN = Integer.valueOf(strList.get(i));
			if(intN % 2 ==0) {
				intSum += intN;
			}
		}
		System.out.println("Â¦¼öÇÕ:" + intSum);
		
		int intEven =0;
		int intOdd = 0;
		for(int i = 0; i < nSize ; i++) {
			int intN = Integer.valueOf(strList.get(i));
			if(intN % 2 ==0) {
				intEven += intN;
			}else {
				intOdd += intN;
			}
		}
		System.out.println("Â¦¼öÇÕ:" + intEven);
		System.out.println("È¦¼öÇÕ:" + intOdd);
	}
	
	public static void addList(List<String> sList) {
		for(int i = 0; i <10; i++) {
		int intNum = (int)(Math.random()*(100+1));
		sList.add(intNum+"");
		}
	}

}
