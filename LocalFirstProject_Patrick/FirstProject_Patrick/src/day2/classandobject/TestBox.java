package day2.classandobject;

public class TestBox {

	public static void main(String[] args) {

		Box ups, fedEx;
		
		ups = new Box();
		ups.length = 5;
		ups.width = 10;
		ups.calculateTotalArea();
		
		fedEx = new Box();
		fedEx.length = 6;
		fedEx.width = 7;
		fedEx.calculateTotalArea();
		
		
	}

}
