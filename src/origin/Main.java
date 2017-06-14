package origin;

import other.ClassOtherPackage;

public class Main {
	
	public static void main(String[] args) {
		
		ClassToAccess test = new ClassToAccess();
		ClassSamePackage testPackage = new ClassSamePackage();
		ClassOtherPackage testOther = new ClassOtherPackage();
		HeritClass testHerit = new HeritClass();
		
		System.out.println("Acc�ss aux variables � l'interieur de la classe :");
		System.out.println();
		test.inClassAccess();
		System.out.println();
		
		System.out.println("Acc�ss aux variables � l'interieur du meme package :");
		System.out.println();
		testPackage.inClassAccess();
		System.out.println();
		
		System.out.println("Acc�ss aux variables dans un autre package package :");
		System.out.println();
		testOther.inClassAccess();
		System.out.println();
		
		System.out.println("Acc�ss aux variables dans une classe qui h�rite de la classe :");
		System.out.println();
		testHerit.inClassAccess();
		System.out.println();
		
	}

}
