package com.biz.collects.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strList = new ArrayList();
		
		strList.add("ȫ�浿");
		strList.add("�̸���");
		strList.add("������");
		strList.add("�念��");
		strList.add("�庸��");
		
		Collections.sort(strList);
		System.out.println(strList); //sort�� �̿��ϸ� ������ ����
		
		Collections.sort(strList, Collections.reverseOrder());
		System.out.println(strList);
		

	}

}
