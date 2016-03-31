package day1.example;

public class ExampleSwitchCase {

	public static void main(String[] args) {

		String j = "Two";
		
		switch (j){
			case "Zero":
				System.out.println("Value is 0");
				break;
			case "ONe":
				System.out.println("Value is 1");
				break;
			case "Two":
				System.out.println("Value is 2");
				break;
			default:
				System.out.println("No value");
				break;
		}
	}

}
