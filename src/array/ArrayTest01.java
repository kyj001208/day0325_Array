package array;

public class ArrayTest01 {

	public static void main(String[] args) {

		// 배열: 동일한 데이터 타입의 집합이다.
		// 메모리상에 순차적으로 할당된다, 인덱스 번호로 이용하여 각각 접근가능
		// 배열은 자동을 default(0) 초기화(stack은 사용자 초기화, heap은 자동초기화)
		// 인덱스번호는 0부터 시작

		// 배열변수 형식
		int n; // 정수형 변수 선언(기초) :로컬변수(지역변수,메서드{}안에서 선언되어서)
		int[] arr; // 배열공간을 참조하는 변수 :로컬변수(지역변수)

		// new:객체를 선언할때 쓰며, heap 메모리를 사용할때
		arr = new int[3]; // 공간을 선언할때는 new를 사용하지만 new없이 arr[0] 0이라는 공간에서 읽어와
		// int 4byte 공간을 3개, //배열은 여러개의 변수를 만들어줍니다.(공간을 할당하게 될경우)
		// 배열변수[인덱스번호]: 인덱스번호 0~
		// arr[0],arr[1],arr[2]

		// System.out.println(n); : n에 대한 초기화를 시켜주지 않았기때문에 초기화 필요(int n=0;)

		for (int i = 0; i < 3; i++) {

			System.out.println("arr[" + i + "]=" + arr[i]);
			//System.out.printf("arr[%d]=%d\n", i, arr[i]);

		}

	}

}
