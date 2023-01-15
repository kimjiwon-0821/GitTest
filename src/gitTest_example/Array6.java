package gitTest_example;

import java.util.Scanner;

public class Array6 {
	public static void main(String[] args) {
		//배열에서 숫자를 삭제하는 것
		int [] arr = {8,5,13,9,6};
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] copy = new int [arr.length-1];
		int idx = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]){
				continue;
			}
			copy[idx]=arr[i];
			idx++;
		}
		arr=copy;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
