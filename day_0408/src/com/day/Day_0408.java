package com.day;

import java.util.Scanner;

public class Day_0408 {

	public static void main(String[] args) {
		
		String name = "helloworld"; // 이 문자열은 배열인가? 아래에서 증명
		
		//System.out.println(name.length());          // 이와 같이 배열은 내재함수 (.뒤에 나오는) 가 존재한다. 한편, 결과로는 10이 나오는데 이는 글자수와 동일. 하지만 max index는 9이다. 항상 max index = 글자수 -1 
		
		int i = 2;
		int j = 1;
		
		while(i<10) {
			j  = 1; 
			while(j<10) {
				System.out.printf("%d * %d = %d" + "\n", i, j, i*j);
				j++;
			}
			System.out.println("------------------------");
			i++;
		}
		
		
					
		}

	static void scanner(int i) {
		Scanner sc = new Scanner(System.in);
		int c = i;
		while(c > -100) {
			
			System.out.println("숫자를 입력하세요");
			c = sc.nextInt();
//			System.out.println(c);
//			if(c==-100)
//				break;
			gugudan2(c);	
		}
		
		do {
			System.out.println("while문을 나왔습니다.");
		} while(false);
	}
	
	
	
	
	static void gugudan_1(int i) {
		
		int m = i < 9 ? 9: i;		
		for (int j = 1; j < m+1; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}		
		}

	
	 
	static void gugudan2(int s) {
		s++;
		if(s < 10)
			s = 10;
		else if(s > 19)
			s = 20;
		
		int m = s;
	
		for (int i = 2; i < m; i++) {
			gugudan_0(i);
			System.out.println("---------------------");
			}

	}
	
	static void gugudan_0(int i) {
		for (int j = 1; j < 10 || j < i+1; j++) {
			System.out.print(i + "*" + j + "=" + i*j + "\t");
		}
	}
	
	
}	
