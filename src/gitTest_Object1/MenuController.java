package gitTest_Object1;

import java.util.Scanner;

public class MenuController {
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(check) {
			System.out.println("1.등록 2.수정 3.삭제 4.종료");
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				check = false;
				break;
			}
		}
			
	}

}
