package origin;

public class ClassToAccess {
	
	private String test1="possible";
	protected String test2="possible";
	public String test3="possible";
	String test4 = "possible";
	static String test5 = "possible";
	
	public void inClassAccess () {
		
		System.out.println("Private : " + test1);
		System.out.println("Protected : " + test2);
		System.out.println("Public : " + test3);
		System.out.println("Rien : " + test4);
		System.out.println("Static : " + test5);
	}
	
}
