package com.biz.collects.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.biz.collects.list.List04;

public class ListToSet01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList();
		List04.addList(strList);
	
		System.out.println(strList);
		// 1. strList���� �ߺ����� ���� �����͸� �����ϰ� �ʹ�.
		// 2. ����� �����ʹ� ������ �Ǿ� ������ ���ڴ�.
		Set<String> strSet = new HashSet(strList);
		System.out.println(strSet);
		
		Set<String> strTreeSet = new TreeSet(strList);
		System.out.println(strTreeSet);
	
		// 3. ���ο� Set�� �ƴ� strList�� �ߺ����� �ʰ�, ���ĵ� strList�� �ٲٰ� �ʹ�.
		strList = new ArrayList(new TreeSet(strList));
		
		Set<String>sSet = new TreeSet(strList);
		strList = new ArrayList(sSet);
	}

}
