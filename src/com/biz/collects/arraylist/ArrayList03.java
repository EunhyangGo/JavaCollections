package com.biz.collects.arraylist;

import java.util.ArrayList;

public class ArrayList03 {

	public static void main(String[] args) {
	/*
	 *  ArrayList : �ټ��� ��ü�� �ٷ�� ���� Java�� Collection�̸�
	 *             ���� �����ɶ��� size()�� 0�̸�, �ʿ信 ���� ���� �߰�, �����ϸ�
	 *             ũ�⸦ �����Ӱ� �����Ͽ� �� �� �ִ�.
	 * 
	 *  arrayList.add(��) : ���� ���� �߰��Ҷ�
	 *  arrayList.add(3,��) :2���� 3�� ���̿� ���� ����������
	 *  arrayList.get(3): 3�� ��ġ�� ���� ������
	 *  arrayList.set(4,��): 4�� ��ġ�� ���� ������ ��
	 *  arrayList.remove(5): 5�� ��ġ�� ���� ����
	 *  arrayList.remove(��): �������� �ƴ� ��� arrList�� ó�� ��Ÿ���� �� �׸��� ���� 
	 *  arrayList.clear(): ��� ���� �����ϰ� size�� 0���� reset
	 *  arrayList.size(): ����Ʈ�� ���� Ȯ��
	 *            
	 *             
	 */
		// TODO Auto-generated method stub

		ArrayList<String> strList = new ArrayList();
		
		strList.add("���");
		strList.add("��");
		strList.add("�丶��");
		strList.add("����");
		strList.add("�ܰ�");
		
		int nSize = strList.size();
		for(int i = 0; i<nSize; i++) {
			System.out.println(strList.get(i));
		}
		
		strList.add(3, "�ٳ���");
		nSize=strList.size();
		for(int i = 0; i<nSize; i++) {
			System.out.println(strList.get(i));
		}
		strList.remove(2);
		System.out.println("===========");
		nSize=strList.size();
		for(int i = 0; i<nSize; i++) {
			System.out.println(strList.get(i));
	}
		strList.add("���");
		strList.add(1,"���");
		strList.add(3,"���");
		strList.add(5,"���");
		System.out.println("===========");
		nSize=strList.size();
		for(int i = 0; i<nSize; i++) {
			System.out.println(strList.get(i));
		}
		strList.remove("���"); //��ü����Ʈ�߿��� ����̶�� ���ڸ� ó�� ������ �����ϴ� ��
		System.out.println("===========");
		nSize=strList.size();
		for(int i = 0; i<nSize; i++) {
			System.out.println(strList.get(i));
		}
		
		
		nSize = strList.size();
		
		for(int i = 0; i<nSize;i++) {
			if(strList.get(i).equals("���")) {
				strList.remove(i); //��ü����Ʈ�� n������� �ϳ��� ���� �������⋚���� ���� ���� �ڵ�
			}
		}
		for(int i = 0; i <nSize ; i++) {
			strList.remove("���");
		}
			System.out.println("===========");
			nSize=strList.size();
			for(int i = 0; i<nSize; i++) {
				System.out.println(strList.get(i));
			}
		}
	
}
