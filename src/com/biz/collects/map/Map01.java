package com.biz.collects.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> strAddr = new HashMap();
		
		strAddr.put("ȫ�浿", "001-001-0001");
		strAddr.put("������", "002-002-0002");
		strAddr.put("�̸���", "003-003-0003");
		strAddr.put("�Ӳ���", "004-004-0004");

		String sTel = strAddr.get("�Ӳ���"); //�Ӳ����� �������� stel�� �����ִ� ��
	    System.out.println(sTel);
	    
	    Set<String> strKey = strAddr.keySet();
	    for(String s : strKey) {
	    	System.out.println(strAddr.get(s));
	    }
	    
	    Map<Integer,String> intNum = new HashMap();
	    intNum.put(90, "ȫ�浿");
	    intNum.put(80, "�̸���");
	    intNum.put(70, "������");
	    intNum.put(60, "�Ӳ���");
	    intNum.put(50, "����");
	    
	    String strName = intNum.get(70);//70�� ��ġ�� ����ִ� ����(������)�� �����Ͷ�.
	    System.out.println(strName);
	    
	    Set<Integer> setInt = intNum.keySet();
	    for(int i : setInt) {
	    	String s = intNum.get(i);
	    	System.out.println(s);
	    }
	    
	}

}
