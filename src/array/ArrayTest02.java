package array;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		//배열변수선언 + 배열공간생성
		//다양한 선언 방법 및 생성방법
		int[] arr=new int[100]; //기본형_이럴경우 자동으로 인덱스 공간 이름을 붙여줌
		int arr2[]=new int[3]; //배열은 위,아래표현으로 표현가능
		String [] str= new String[3];
		
		
		byte [] ar, ar2; //연속적인 배열변수 선언방식
		
		
		int [] a= {1,2,3};//초기화리스트(범위데이터)
		String [] st= {"aa","bb","cc"}; //초기화리스트
		
		
		int[]nums;
		//nums= {1,2,3}; :초기화리스트경우 변수선언과 동시에 해줘야함
		
		nums=new int[] {1,2,3};// 로 선언 가능
		
		
		
	}

}
