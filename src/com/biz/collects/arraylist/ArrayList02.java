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
		intList.add(70); //4 번 데이터
		
		//intList의 3번째 데이터 60을 보고싶다
		int n = intList.get(3);
		System.out.println(n); //60이라는 숫자나옴.
		
		System.out.println(intList.get(2));
		// intList의 두번째 데이터(50)을 100으로 바꾸고 싶다.
		intList.set(2, 100); //intList 2번째 값을 100으로 바꾸고싶다는 의미.
		n = intList.get(2);
		System.out.println(n);
		
		// intList의 개수가 몇개냐
		int nSize = intList.size();
		System.out.println("intList개수: " + nSize +"개");
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
		//추가할때 add, 값을 불러올떄 get, 값을 삭제할때 remove
		}
		System.out.println("===============");	
		intList.add(2,900); //2번째 위치에 900값을 넣고 싶다.는뜻. 그럼 그 사이에 끼워넣기가 됨
		nSize = intList.size();
		for(int i = 0; i<intList.size(); i++) {
			System.out.println(i+":"+intList.get( i ));
		}
		System.out.println("===============");
		intList.add(2,100); //2번위치에 100추가
		intList.add(4,100); //4번위치에 100추가
		intList.add(100); //이건 맨 끝에 추가한 것
		nSize = intList.size();
		for(int i = 0; i<intList.size(); i++) {
			System.out.println(i+":"+intList.get( i ));
		}
		
	}

}
