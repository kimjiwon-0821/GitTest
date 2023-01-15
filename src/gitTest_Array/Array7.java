package gitTest_Array;

import java.util.Scanner;

public class Array7 {
	public static void main(String[] args) {
		//1.추가 2.삭제 3. 종료 - 0번인덱스 추가, 삭제
		int [] arr = {5,1,4};
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(check) {
			System.out.println("1.추가 2.삭제 3. 종료");
			int num = sc.nextInt();
			switch(num) {
				case 1:
					System.out.println("추가할 숫자 입력 : ");
					num=sc.nextInt();
					int [] copy = new int[arr.length+1];
					copy[0]=num;
					for(int i=0;i<arr.length;i++) {
						copy[i+1]=arr[i];
					}
					arr=copy;
					for(int i=0;i<arr.length;i++) {
						System.out.println(arr[i]);
					}
					break;
				case 2:
					int [] copy2 = new int[arr.length-1];
					for(int i=0;i<arr.length;i++) {
						copy2[i]	= arr[i+1];	
					}
					arr=copy2;
					for(int i=0;i<arr.length;i++) {
						System.out.println(arr[i]);
					}
					break;
				case 3 :
					System.out.println("프로그램 종료");
					check = false;
					break;
			}
		}
		
	}

}
