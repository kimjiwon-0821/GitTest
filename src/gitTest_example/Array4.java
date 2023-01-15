package gitTest_example;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{1,2,3}배열을 받아서 새로운 배열을 4를 추가해서 받아라
		int [] arr = {1,2,3};
		int [] copy = new int [arr.length+1];
		
		for(int i=0;i<arr.length;i++) {
			copy[i] = arr[i];
		}
		copy[copy.length-1]=4;
		arr = copy;//arr과 copy의 type이 array로 같기 때문에 대입할 수 있음.
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr); // arr은 stack에 저장된 heap주소를 출력한다.

	}

}
