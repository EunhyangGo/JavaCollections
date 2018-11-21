package com.biz.collects.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> strAddr = new HashMap();
		
		strAddr.put("È«±æµ¿", "001-001-0001");
		strAddr.put("¼ºÃáÇâ", "002-002-0002");
		strAddr.put("ÀÌ¸ù·æ", "003-003-0003");
		strAddr.put("ÀÓ²©Á¤", "004-004-0004");

		String sTel = strAddr.get("ÀÓ²©Á¤"); //ÀÓ²©Á¤ÀÇ º§·ù°ªÀ» stel¿¡ º¸³»ÁÖ´Â °Í
	    System.out.println(sTel);
	    
	    Set<String> strKey = strAddr.keySet();
	    for(String s : strKey) {
	    	System.out.println(strAddr.get(s));
	    }
	    
	    Map<Integer,String> intNum = new HashMap();
	    intNum.put(90, "È«±æµ¿");
	    intNum.put(80, "ÀÌ¸ù·æ");
	    intNum.put(70, "¼ºÃáÇâ");
	    intNum.put(60, "ÀÓ²©Á¤");
	    intNum.put(50, "Àå±æ»ê");
	    
	    String strName = intNum.get(70);//70ÀÎ À§Ä¡¿¡ µé¾îÀÖ´Â º§·ù(¼ºÃáÇâ)À» ²¨³»¿Í¶ó.
	    System.out.println(strName);
	    
	    Set<Integer> setInt = intNum.keySet();
	    for(int i : setInt) {
	    	String s = intNum.get(i);
	    	System.out.println(s);
	    }
	    
	}

}
