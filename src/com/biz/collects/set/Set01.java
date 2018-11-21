package com.biz.collects.set;

import java.util.HashSet;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		/* list만큼 많이 사용하진 않음
		 * Set은 List와 비슷한데 중복데이터가 없는 경우
		 * 중복데이터는 표시안함.
		 *  
		 */
		Set<String> strSet6 = new HashSet<String>();
		Set<String> strSet7 = new HashSet<>();
		Set<String> strSet8 = new HashSet();
		
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		
		System.out.println("strSet8");
	}

}
