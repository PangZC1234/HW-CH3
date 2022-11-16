package p7;

public class test3_p07 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		Car car2;
		car2 = new Car();
		
		car2.num = 1234;
		car2.gas = 20.5;
		
		System.out.println("車號是"+car1.num);
		System.out.println("汽油量是"+car1.gas);
		
		System.out.println("車號是"+car2.num);
		System.out.println("汽油量是"+car2.gas);
	}
}

class Car{
	int num;
	double gas;
}