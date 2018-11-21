package com.biz.collects.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listNum = new ArrayList();
		
		for(int i = 0 ; i < 45; i++) {
			listNum.add(i+1);
		}

		Collections.shuffle(listNum);//list의 값을 뒤죽박죽 뒤집어서 6개만 보이라는 말
		
		ArrayList<Integer> lottoNums = new ArrayList();
		for(int i = 0 ; i < 6 ; i++) {
			lottoNums.add(listNum.get(i));
			// System.out.println(listNum.get(i)+",");
		}
		System.out.println();
		
		Collections.sort(lottoNums);
		System.out.println(lottoNums);
	}

}
