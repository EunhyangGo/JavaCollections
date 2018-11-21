package com.biz.collects.arraylist;

import java.util.ArrayList;

public class ArrayList03 {

	public static void main(String[] args) {
	/*
	 *  ArrayList : 다수의 객체를 다루기 위한 Java의 Collection이며
	 *             최초 생성될때는 size()가 0이며, 필요에 따라서 값을 추가, 삭제하며
	 *             크기를 자유롭게 설정하여 쓸 수 있다.
	 * 
	 *  arrayList.add(값) : 끝에 값을 추가할때
	 *  arrayList.add(3,값) :2번과 3번 사이에 값을 끼워넣을때
	 *  arrayList.get(3): 3번 위치의 값을 읽을때
	 *  arrayList.set(4,값): 4번 위치의 값을 변경할 때
	 *  arrayList.remove(5): 5번 위치의 값을 삭제
	 *  arrayList.remove(값): 숫자형이 아닌 경우 arrList중 처음 나타나는 값 항목을 삭제 
	 *  arrayList.clear(): 모든 값을 삭제하고 size를 0으로 reset
	 *  arrayList.size(): 리스트의 갯수 확인
	 *            
	 *             
	 */
		// TODO Auto-generated method stub

		ArrayList<String> strList = new ArrayList();
		
		strList.add("사과");
		strList.add("배");
		strList.add("토마토");
		strList.add("망고");
		strList.add("단감");
		
		int nSize = strList.size();
		for(int i = 0; i<nSize; i++) {
			System.out.println(strList.get(i));
		}
		
		strList.add(3, "바나나");
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
		strList.add("대봉");
		strList.add(1,"대봉");
		strList.add(3,"대봉");
		strList.add(5,"대봉");
		System.out.println("===========");
		nSize=strList.size();
		for(int i = 0; i<nSize; i++) {
			System.out.println(strList.get(i));
		}
		strList.remove("대봉"); //전체리스트중에서 대봉이라는 글자를 처음 만나면 삭제하는 것
		System.out.println("===========");
		nSize=strList.size();
		for(int i = 0; i<nSize; i++) {
			System.out.println(strList.get(i));
		}
		
		
		nSize = strList.size();
		
		for(int i = 0; i<nSize;i++) {
			if(strList.get(i).equals("대봉")) {
				strList.remove(i); //전체리스트가 n사이즈보다 하나씩 값이 작이지기떄문에 옳지 않은 코드
			}
		}
		for(int i = 0; i <nSize ; i++) {
			strList.remove("대봉");
		}
			System.out.println("===========");
			nSize=strList.size();
			for(int i = 0; i<nSize; i++) {
				System.out.println(strList.get(i));
			}
		}
	
}
