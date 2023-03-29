package package1;
import package2.*;

public class A {
	/*
	not define Will not work inside A, if we paste all in C or Asub will work because is inside the same package2
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.defaultMessage);
	}

	
	/**************************/
	protected String protectedMessage="This is protected";
	
	
	public static void main(String[] args) {
		B b = new B();
		//System.out.println(b.privateMessage); //ERROR not visible
	}
	
}

