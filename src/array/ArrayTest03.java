package array;

public class ArrayTest03 {

	public static void main(String[] args) {

		// 배열 사용
		// 배열변수는 참조형변수 :다른 메모리를 참조하는 타입

		// int n=100;

		int[] arr = new int[5]; // 배열 변수 + 배열 공간
		//arr[0] ~ arr[arr.length-1]
		//마지막 인덱스 : 배열변수.length-1

		// for(int i=0, j=0;;) :,를 사용하여 두개 사용 가능
		// 배열이름.length :배열 길이 속성

		System.out.println("배열길이 : " + arr.length); // 길이 정보를 제공하는 표현

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (i + 1) * 10;

		}

		// 배열출력
		for (int i = 0; i < arr.length; i++) {

			System.out.println("arr[" + i + "]=" + arr[i]);

		}
		System.out.println("------");
		System.out.println("마지막 인덱스에 저장된 값? " + arr[arr.length-1]);
		
		//Exception 예외처리 발생 : ArrayIndexOutOfBoundsException
		//System.out.println(arr[5]);

	}

}
