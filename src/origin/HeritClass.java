package origin;

public class HeritClass extends ClassToAccess {

	
	public void inClassAccess () {
		
		// System.out.println("Private : " + test1);
		System.out.println("Private : impossible");
		System.out.println("Protected : " + test2);
		System.out.println("Public : " + test3);
		System.out.println("Rien : " + test4);
		System.out.println("Static : " + test5);
	}
}
