package gitTest_Object1;

import java.util.Scanner;

public class MenuController {
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(check) {
			System.out.println("1.학생 정보 입력 2.학생 검색 정보 출력 3.학생 전체 정보 출력 4.학생 추가 5.종료");
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				System.out.println("학생정보를 입력해주세요.");
				break;
			case 2:
				System.out.println("검색할 학생을 입력해주세요 : ");
				break;
			case 3:
				break;
			case 4: 
				break;
			case 5:
				System.out.println("종료합니다.");
				check = false;
				break;
			}
		}
			
	}

}
