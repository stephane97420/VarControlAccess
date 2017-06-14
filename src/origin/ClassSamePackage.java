package origin;

public class ClassSamePackage {
	
	private ClassToAccess testpackage;
	
	public void inClassAccess () {
		testpackage = new ClassToAccess();
		
		//System.out.println("Private : " + testpackage.test1);
		System.out.println("Private : impossible");
		System.out.println("Protected : " + testpackage.test2);
		System.out.println("Public : " + testpackage.test3);
		System.out.println("Rien : " + testpackage.test4);
		System.out.println("Static : " + testpackage.test5);
	}
	
}
