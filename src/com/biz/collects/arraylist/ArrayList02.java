package com.biz.collects.arraylist;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> intList = new ArrayList();
		
		intList.add(30); //0
		intList.add(40); //1
		intList.add(50); //2
		intList.add(60); //3
		intList.add(70); //4 �� ������
		
		//intList�� 3��° ������ 60�� ����ʹ�
		int n = intList.get(3);
		System.out.println(n); //60�̶�� ���ڳ���.
		
		System.out.println(intList.get(2));
		// intList�� �ι�° ������(50)�� 100���� �ٲٰ� �ʹ�.
		intList.set(2, 100); //intList 2��° ���� 100���� �ٲٰ�ʹٴ� �ǹ�.
		n = intList.get(2);
		System.out.println(n);
		
		// intList�� ������ ���
		int nSize = intList.size();
		System.out.println("intList����: " + nSize +"��");
		for(int i = 0; i<intList.size(); i++) {
			System.out.println(intList.get( i ));
		}
			
		nSize = intList.size();
		for(int i = 0; i<intList.size(); i++) {
			System.out.println(i + ":"+intList.get( i ));
		}
		System.out.println("===============");	
		intList.remove(3);
		nSize = intList.size();
		for(int i = 0; i<intList.size(); i++) {
			System.out.println(i+":"+intList.get( i ));
		//�߰��Ҷ� add, ���� �ҷ��Ë� get, ���� �����Ҷ� remove
		}
		System.out.println("===============");	
		intList.add(2,900); //2��° ��ġ�� 900���� �ְ� �ʹ�.�¶�. �׷� �� ���̿� �����ֱⰡ ��
		nSize = intList.size();
		for(int i = 0; i<intList.size(); i++) {
			System.out.println(i+":"+intList.get( i ));
		}
		System.out.println("===============");
		intList.add(2,100); //2����ġ�� 100�߰�
		intList.add(4,100); //4����ġ�� 100�߰�
		intList.add(100); //�̰� �� ���� �߰��� ��
		nSize = intList.size();
		for(int i = 0; i<intList.size(); i++) {
			System.out.println(i+":"+intList.get( i ));
		}
		
	}

}
