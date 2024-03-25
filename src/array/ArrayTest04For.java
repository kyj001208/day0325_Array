package array;

public class ArrayTest04For {

	public static void main(String[] args) {

		// int형의 배열변수 arr(이름)↓
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		// 인덱스 : 0~ arr.length-1(렝쓰전까지)

		for (int i = 0; i < arr.length; i++) {

			

			System.out.println("arr[" + i + "] = " + arr[i]);

		}

		//
		System.out.println("-------------");
		// forEach :자바가 알아서 순차적으로 접근해서 읽어온다.
		// for(변수선언 : 배열이름){}

		for (int num : arr) {
			
			System.out.println(num);
		}
	}

}
