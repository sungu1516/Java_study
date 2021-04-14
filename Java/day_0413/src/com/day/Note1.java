package com.day;

public class Note1 {

	public static void main(String[] args) {
		make_tri();

	}

	static int test_1(int c) {
		System.out.println(c);
		// for 문 사용하지 않고 반복문 탈출하기 - 재귀함수 사용
		if (c == 0) // 탈출을 위해 if문 넣어준다.
			return 0;
		else {
			return test_1(--c);
		}
	}

	static void test_2(int c) {
		System.out.println(c);
		// for문을 사용하지 않고 반복 돌려보기 - 재귀함수 사용2
		if (c == 0) // 탈출을 위해 if문 넣어준다.
			return;
		else
			test_2(--c);
	}

	static void test_eternal() {
		// 재귀함수의 예시
		System.out.println("test");
		test_eternal();
	}

	static void make_tri() {
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > 0; j--) { // i의 값에 따라 for구문 돌아가는 횟수가 달라진다.

				if (i >= j) {
					System.out.print('*');
				}

			}
			System.out.println();
		}
	}
}
