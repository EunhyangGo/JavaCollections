package com.biz.collects.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List<String> strList1 = new List();
		// List Ŭ������ �������� Ŭ������ ��ü�� �����ϴ� �뵵�δ� ��� ����.
		List<String> strList = new ArrayList();
		List04.addList(strList);
		
		// while�� ����� �ݺ����� ������ �� List�� Iterator�� ��ȯ�Ͽ� ����Ѵ�.
		Iterator<String> itr = strList.iterator();
		int intSum=0;
		while(true) {
			if(itr.hasNext()) {
				String s = itr.next();
				intSum += Integer.valueOf(s);
			}else {
				break;
			}
		}
		intSum = 0;
		while(true) {
			if( !itr.hasNext()) break;
			String s = itr.next();
			intSum += Integer.valueOf(s);
			}
		
		intSum = 0; 
		while(itr.hasNext()) {
			String s = itr.next();
			intSum += Integer.valueOf(s); //���� iterator �ڵ�� �� ������
		}
	}

}
