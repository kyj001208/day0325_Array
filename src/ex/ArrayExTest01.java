package ex;

public class ArrayExTest01 {

	public static void main(String[] args) {

		// 정수형 변수 10개를 배열로 생성하고 각 변수의 값은 1 ~10 초기화하세요
		// 출력은 큰수부터 출력하세요

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			// i <9라는것은 i가 1로 가고 2로 가고 3로가고 증가한다는 의미

			arr[i] = i + 1;

		}
		for (int i = 9; i >= 0; i--) {
			//for(int i=arr.length-1; i>=0; i--)로도 표현가능
			// i>=0이라는것은 i가 9로 가고 8로 가고 7로 가고 줄어든다는 의미

			System.out.println("arr[" + i + "]=" + arr[i]);
		}

	}

}
