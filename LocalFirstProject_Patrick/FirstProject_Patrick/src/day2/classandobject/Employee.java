package day2.classandobject;

public class Employee {

	double salary;
	double bonus;
	
	void calculateTotalPay(){
		double totalPay = salary + bonus;
		System.out.println("Total pay =" + totalPay);
	}

}
