package com.biz.collects.list;

import java.util.ArrayList;
import java.util.List;

public class List05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList();
		List04.addList(strList);
		
		int intSum = 0;
		/*
		 * for..each��� �ϴ� ����, Ȯ��� for����
		 * List�� 0��° ��ġ���� ������ �ݺ������� ��ȸ�ϸ鼭 
		 * ������ ó���� ��� ����� �� �ִ� for����
		 * 
		 * strList�� ������ŭ �ڵ����� �ݺ� ������ �����Ǹ� 
		 * �� ȸ������ strList�κ��� ��Ҹ� 1���� �о
		 * String s�� ���� �Ѵ�.
		 * 
		 * for ���� ������ s ������ ����ؼ� �������� ������ ������ �� �ִ�.
		 * 
		 */
		for(String s : strList) { 
			intSum += Integer.valueOf(s);
		}
		System.out.println(strList);
		System.out.println("�հ�: " + intSum);
	}

}
