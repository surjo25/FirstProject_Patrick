package day1.example;

public class ExampleArrays {

	public static void main(String[] args) {

		/*int a = 10;
		int b = 20;
		int c, d, e;
		c = 30;
		d = 40; e = 50;*/
		
		int[] a = {10, 20, 30, 40, 50};
		System.out.println(a[2] + "  " + a[4]);
		
		System.out.println("=====================");
		//enhanced for
		for(int temp : a){
			System.out.println(temp);
		}
		System.out.println("=====================");
		int[] x = new int[5];
		x[3] = 25;
		x[0] = 12;
		for( int xx : x){
			System.out.println(xx);
		}
		
		System.out.println("====================");
		String[] str = new String[5];
		
		str[3] = "25";
		str[0] = "12";
		for(String temp2 : str){
			System.out.println(temp2);
		}
		
	}

}
