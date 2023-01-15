package gitTest_Method;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sword sword = new Sword();
		sword.name="집행검";
		sword.damage=200;
		System.out.println(sword.name);
		
		MethodTest mt = new MethodTest();
		mt.t1();
		MethodTest3 mt3 = new MethodTest3();
		mt3.t3(3554,5.95);
		

	}

}
