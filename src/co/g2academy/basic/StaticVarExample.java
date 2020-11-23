package co.g2academy.basic;

public class StaticVarExample {
	
	public static String myClassVar = "class or static variable";

	public static void main(String[] args){
		StaticVarExample obj = new StaticVarExample();
		StaticVarExample obj1 = new StaticVarExample();
		StaticVarExample obj2 = new StaticVarExample();
		
		//all three will display "classor static variable"
		System.out.println(obj.myClassVar);
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);

		obj2.myClassVar = "Changed text";
		//All three will display "Changed text"
		System.out.println(obj.myClassVar);
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);		
	}
}