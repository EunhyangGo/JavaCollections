package com.biz.collects;

public class Arrays01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		aa();
		// �� �ڽ�(Arrays01 Class)�� ���� ��ü�� ������ �����ϴ� ���
		// ���ο� Array01�� ������ ��ü ����
		Arrays01 a = new Arrays01();
		// ���� ������ ��ü�� �ִ� static�� �ƴ� bb() method�� ȣ��(���)�� �� �ְ�,
		a.bb();
		
		//Arrays01�� ���Ե� MyBook inner class�� ����ҋ���
		//���� Arrays01�� ������ ��ü�� ����(����)�Ͽ� �� ��ü�κ��� newŰ���带
		//ȣ�� ����ؾ� inner class�� ����� �� �ִ�.
		MyBook myBook= a.new MyBook();
		myBook.strTitle ="�ڹپ߳���";
		myBook.strAuth ="���ü�";
		myBook.strComp ="������ȭ��";

		
	}

	
	//inner class��� �Ѵ�.(���ο� �ִٰ� �ؼ�)
	//Arrays01���� ���� Ư���� �ۼ��Ǵ� class
	//inner class�� ù ���� Ű���带 �Ϲ������� private���� ������ �Ѵ�.
	private class MyBook{

		String strTitle;
		String strAuth;
		String strComp;
		
	}
	public void bb() {
		System.out.println("���� BB method");
	}
	public static void aa() {
		System.out.println("���� aa method");
	}
}
