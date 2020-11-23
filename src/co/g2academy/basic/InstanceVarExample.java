package co.g2academy.basic;

public class InstanceVarExample {
	
	public String myClassVar = "class or static variable";

	public static void main(String[] args){
		InstanceVarExample obj = new InstanceVarExample();
		InstanceVarExample obj2 = new InstanceVarExample();
		InstanceVarExample obj3 = new InstanceVarExample();
		
		//all three will display "classor static variable"
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);

		obj2.myClassVar = "Changed text";
		//All three will display "Changed text"
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);		
	}
}