package com.day;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day_0414 {

	public static void main(String[] args) {
		String str = "Lee;Sun;Gu";

		String[] str_arr = str.split(";");

		char[][] char_arr = new char[str_arr.length][];

		// 넣어보기

		for (int i = 0; i < str_arr.length; i++) {
			char_arr[i] = new char[str_arr[i].length()];
			for (int j = 0; j < str_arr[i].length(); j++) {
				char_arr[i][j] = str_arr[i].charAt(j);
			}
			System.out.println(char_arr[i]);
		}

	}

	static void string_to_char() {
		String text = "hello;world;Sunguleeeee";
		String[] tp = text.split(";");
		char[][] ca = new char[tp.length][];

		for (int i = 0; i < tp.length; i++) {
			ca[i] = new char[tp[i].length()];
			for (int j = 0; j < tp[i].length(); j++) {
				ca[i][j] = tp[i].charAt(j);
			}

		}
		for (int i = 0; i < ca.length; i++) {
			System.out.println(ca[i]);
		}
	}

	static void List_time() {
		ArrayList<Integer> list = new ArrayList<Integer>(); // 주소값 할당
		LinkedList<Integer> list_i = new LinkedList<Integer>();
		// 위 두 가지 클래스는 모두 이들의 공통 조상인 List(=interface)로 받을 수 있다.

		ArrayList<int[]> arr_list = new ArrayList<int[]>();

		int[] arr_int = new int[10];
		for (int i = 0; i < arr_int.length; i++) {
			arr_int[i] = i;
		}

		arr_list.add(arr_int);

		int[] arr_int1 = new int[10];
		for (int i = 0; i < arr_int1.length; i++) {
			arr_int1[i] = i;
		}

		arr_list.add(arr_int1);

		for (int i = 0; i < arr_list.size(); i++) {
			System.out.println("배열의 주소 출력 : " + arr_list.get(i));
			for (int j = 0; j < arr_list.get(i).length; j++) {
				System.out.println("해당 배열 안의 원소 출력" + arr_list.get(i)[j]);
			}

		}

		// 두 클래스의 차이를 보자.
		// 결론적으로, 두 클래스의 작동방식이 다르다. 삽입 및 삭제에 있어 listed가 더 효율적
//		timeCurrent(list); // 아래에서 정의한 메서드의 인자로 주소값이 들어간다.
//		System.out.println(list.size());
//		timeCurrent(list_i);
//		System.out.println(list.size());
	}

	static void timeCurrent(List<Integer> l) { // 맨 위에서 만든 list 의 주소가 전달됨. 이를 참조하여 값을 넣는다.
		// 삽입 및 삭제의 시간을 측정한다
		double startTime = System.currentTimeMillis(); // for문 시작시간 기록
		for (int i = 0; i < 10000; i++) {
			l.add(i);
		}
		for (int i = 0; i < 10000; i++) {
			l.remove(0);
		}
		double endTime = System.currentTimeMillis(); // for문 끝 시간 기록
		System.out.println(endTime - startTime);
	}

	static void constructor() {
		// 내가 만든 A클래스를 활용하여 객체 생성

		A a = new A(5);
		A a_1 = new A("Sungu"); // 공통의 interface를 선언
		B b = new B();

		String n = new String("hello"); // "hello" 를 넣었을 때의 생성자도 존재하는 것
		String n_2 = new String(); // 이는 위에 문자열을 넣었을 때의 생성자와 다르다. 즉, 클래스 내에서 여러 생성자를 만들 수 있다.

	}
}
