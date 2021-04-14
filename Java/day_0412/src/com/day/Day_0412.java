package com.day;

import java.util.Iterator;

public class Day_0412 {

	public static void main(String[] args) {
		
		//2차배열
		
		int[][] array = new int[3][];       // array라는 2차 배열 안에 주소를 저장할 공간을 3개 만든다.
		
		
		array[0] = new int[3];             // 이는 쉽게 말해 1차 배열을 3개 만드는 것을 의미한다. 하지만 단순히 서로 다른 1차배열 3개를 만드는 것과는 다르다. 
		
		array[1] = new int[3];			// 2차 배열을 통해 3개의 배열을 만드는 것의 장점은, 예컨대 for문을 통해 보다 더 간단하게 배열의 값을 저장할 수 있다는 것이다. 
		array[2] = new int[3];          // 참조타입이다. 
		
		array[0][0] = 100;             // 이는 직접 하나하나 대입. 아래와 같이 for문을 통해 간단하게 입력 가능. 
		array[0][1] = 200;             // 참조타입이다.
		array[0][2] = 300;
		
		array[1][0] = 100;
		array[1][1] = 200;
		array[1][2] = 300;
		
		array[2][0] = 100;
		array[2][1] = 200;
		array[2][2] = 300;
		
		
		// 위의 대입 과정을 for문으로 구현해보자
//		System.out.println(array);               // 가장 상위 배열인 2차 배열의 주소. 배열의 배열들을 관리 
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
//				array[i][j] = (j+1)*100;
//				System.out.println(array[i]);                    // 이는 주소를 저장하는 공간. 또한 하위 배열인 1차배열의 주소를 의미한다. 
//				System.out.println(array[i][j]);                 // 이는 변수를 저장하는 공간 
			}			
		}
		
		
		// 배열로 stirng 설명 
		
		String[] string_text = new String[3];
		int[] text_int = new int[3];
		string_text[0] = "hello";
		System.out.println(string_text[0]);
		
		//System.out.println(text_int);
		
		String n = string_text[0];  // 이 경우 new로 새로운 객체를 만드는 것이 아니기 때문에, n은 stirng_text[0]의 주소를 그대로 가져오게 된다.
		//String n = "hhhh"; // 하지만 다른 value를 넣어줄 경우 다른 주소를 갖게 된다. 
		
		
		
		int[] a = {100, 200};                // 초기화해서 첫 째 값은 100으로
		
		toString_test(a);             // 아래에서 정의한 함수를 사용. 이 때, a는 배열이므로 a의 주소를 넣어주는 것이다.   
		System.out.println("배열입니다. : " + a[0]);    // 참조타입인 배열을 함수의 인자로 넣어주었기 때문에 실제 배열의 값이 바뀐다. 
		toString_test(a[0]);       // 위와 다르게 value타입을 넣어준다. 이는 곧 함수의 인자로 a[0]에 해당하는 값만을 넣어주는 것을 의미한다. 
		System.out.println("value입니다. : " + a[0]);     // 기존 배열의 값은 변하지 않는다. 
		
		
		
		
		// String 타입 또한 배열이라는 것을 생각하며, 관련 내용을 공부해보자. 
		
		text = text_f();
		String text2 = "helloworld";
		String text3 = new String("helloworld");
		String text4 = text; //이 경우 text의 주소를 그대로 text4로 넘겨준다.
		
		
		if (text_t() == text2)                         // string의 경우 참조타입의 변수이기 때문에, value를 비교하는 것이 아니라 주소를 비교하게 된다. 
			System.out.println("두 주소가 같다");
		else 
			System.out.println("주소가 틀림");
		
//		if (text_f() == text3);
//			System.out.println("new객체와 주소가 같다?");
//		else
//			System.out.println("new객체와 주소가 다르다");
		
		
		// equal 메서드란?
		// 쉽게말해서 Sting 자료형의 주소가 아닌 값을 비교해준다. 많이 사용됨 
		if (text2.equals(text))
			System.out.println("value가 같습니다.");
		
		
		// 그 외 여러가지 String 메서드
		char c = text2.charAt(text2.length() - 1);     //문자열의 특정 부분을 가져와 주는 메서드. 문자 하나이므로 char자료형 선언 뒤 저장 
		System.out.println(c);
		
		
	}
	
	static String text = "helloworld";         // 전역 변수를 선언 및 초기화한다. 이는 아래의 메서드에서 리턴이 가능 
	
	static String text_f() {
		return "helloworld";
	}
	
	static String text_t() {
		return text;
	}
	
	// 결론 : string 의 내용이 같으면 같은 주소를 할당한다. 위의 경우 helloworld 에 대한 주소를 할당하고, 이후 동일한 stirng 을 정의한 경우 같은 주소로 할당한다.
	// 하지만 new를 통해 클래스로 새로운 객체를 만들 경우 string 내용이 같더라도 다른 주소를 할당받는다.
	
	static int toString_test(int[] n) {
		
		n[0] = 500;
		return n[0];
	}
	
	static int toString_test(int n) {
		n = 1000;
		return n;
	}

}

