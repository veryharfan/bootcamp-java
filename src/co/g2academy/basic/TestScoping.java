package co.g2academy.basic;

public class TestScoping {
	
	public static void main(String[] args) {
		ScopeExample scope = new ScopeExample();
		scope.firstMethod();
		scope.printVariable();
		scope.secondMethod(20);
		scope.printVariable();
	}

	public void doComputation() {
		int x = 10;
		int y;
		int z;
		y = 9;
		z = x + y;
	}

}