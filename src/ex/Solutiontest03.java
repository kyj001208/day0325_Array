package ex;

public class Solutiontest03 {

	public static void main(String[] args) {
		
		boolean[] arr= {true,true,true,false,
				true,false,true,false,false,
				true,true,true};
		
		//true ->"따"로 출력 ,false -> " "
		
		for(int a=0;a<arr.length;a++) {
			//변수 a가 arr의 길이만큼 돌려줌
			
			System.out.println(arr[a]?"따":"");//삼항연산자로 표현 가능
			
			///////////////또는 if문으로 사용가능 
			if(arr[a]==true) {
				
				//boolean 데이터는 굳이 비교 연산하지 않아도 나옴(true일때는 실행되니깐)
				System.out.print("따");
			
			}else {
				
				System.out.print(" ");
				
		   /////////////////////////////////아래와 같이 for each로 표현가능
				
		   //for(boolean bool: arr){
				
		   //System.out.println(bool ? "따" : "");}
				
				
				}
				
			}
			
				
			
		}
		
		
	}


