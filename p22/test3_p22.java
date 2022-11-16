package p22;

public class test3_p22 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.setNumGas(1234,20.5);
		car1.show();
		
		System.out.println("指定不正確的汽油量[-10.0]看看");
		
		car1.setNumGas(1234,-10.0);
		car1.show();
	}
}

class Car{
	private int num;
	private double gas;
	
	public void setNumGas(int n, double g) 
	{
		if(g>0 && g<100) 
		{
			num = n;
			gas = g;
			System.out.println("將車號設爲"+num+"，汽油量設爲"+gas);
		}
		else 
		{
			System.out.println("汽油量不可爲負,所輸入為:"+g);
			System.out.println("無法更變汽油量");
		}
	}
	
	public void show() 
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}