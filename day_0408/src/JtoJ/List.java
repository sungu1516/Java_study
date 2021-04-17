package JtoJ;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// List에 대해 알아보자. 앞의 Array와 다르게 자료형으로 구분되며, 배열과 다르게 크기가 정해져있지 않다. 
		// List의 자료형은 여러가지가 있는데, 그 중 가장 간단한 ArrayList에 대해 알아보자.
		
		ArrayList pitches = new ArrayList();
		pitches.add(138);
		pitches.add(140);
		pitches.add(150);
		pitches.add(0, 133);
		
		// get을 통해 특정 값 가져오기
		System.out.println(pitches.get(0));
		
		// size를 통해 크기 출력
		System.out.println(pitches.size());
		
		// contain을 통해 특정 값이 있는지 판별
		
		System.out.println(pitches.contains(140));
	}

}
