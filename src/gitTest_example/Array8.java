package gitTest_example;

import java.util.Scanner;

public class Array8 {
	public static void main(String[] args) {
		//1. 내림차순 2. 오름차순
		Scanner sc = new Scanner(System.in);
		int [] arr = {5,9,8,3,6};
		int tmp=0;
		System.out.println("내림차순v");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		System.out.println("오름차순^");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		
	}

}
