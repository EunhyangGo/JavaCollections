package com.biz.collects.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.biz.collects.list.List04;

public class ListToSet02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList();
		List04.addList(strList);
		
		// �ߺ����� ����(������ ������) ������ ��ȯ
		strList = new ArrayList(new HashSet(strList));
		
		// �������� ���ĵ� �ߺ����� ���� ������ ��ȯ
		strList = new ArrayList(new TreeSet(strList));

	}

}