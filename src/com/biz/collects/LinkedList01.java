package com.biz.collects;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  ArrayList�� ���� �ټ��� �����͸� ����, �߰�, ����, ����Ʈ�������
		 *  ������ �� �ִ� Collections(�迭Ŭ����)�̴�.
		 *  ArrayList�� ���Ǵ� �⺻ method��
		 *  add(), get(), set(), remove(), clear(), size() ��� ��� ����
		 *  ���� ���� ������� �ʴ�..���� arraylist�� ���� �����
		 */
		LinkedList<String> strList = new LinkedList();
		
		strList.add("ȫ�浿");
		strList.add("�̸���");
		strList.add("������");
		strList.add("�庸��");
		strList.add("�Ӳ���");
		
		Collections.sort(strList);
		System.out.println(strList);

	}

}
