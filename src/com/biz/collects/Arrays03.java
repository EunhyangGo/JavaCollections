package com.biz.collects;

import com.biz.collects.vo.BookVO;

public class Arrays03 {

	public static void main(String[] args) {
 
		//1���� �����͸� �����ϱ� ���� VO��ü�� ����
		BookVO bookVO = new BookVO();
		bookVO.setStrTitle("�����ڹ�");
		bookVO.setStrAuth("������");
		bookVO.setStrComp("������ �̵��");
		
		String[] arrNation = new String[3];
		arrNation[0] = "���ѹα�";
		arrNation[1] = "�����߱�";
		arrNation[2] = "������";
		
		BookVO[] arrBookVO = new BookVO[3];
		arrBookVO[0] = new BookVO();
		arrBookVO[0].setStrTitle("�����ڹ�");
		arrBookVO[0].setStrAuth("������");
		arrBookVO[0].setStrComp("������ �̵��");
		
		arrBookVO[1] = new BookVO();
		arrBookVO[1].setStrTitle("�ڹ��� ������");
		arrBookVO[1].setStrAuth("���ü�");
		arrBookVO[1].setStrComp("�����̵��");
		

		arrBookVO[2] = new BookVO();
		// �迭�� �ϴ� ������ ������ ������ �� �� �ٽ� ũ��(����)�� �ø��ų�
		// ���̱� ���� �ٽ� ������ �ϸ�, ���� �迭�� ����ִ� ������ ������ �� ����.(���� ������ٴ� ���� ���� �̾߱�)
		//�׷��� �迭�� �ѹ� ũ�Ⱑ ������ �����Ǹ� �� ũ�⸦ ������ �� ����.(���� �Ұ���)
		//
		arrBookVO = new BookVO[10];
		

		
		
	}
}
