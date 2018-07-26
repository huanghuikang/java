class  Car
{
	int num;
	String color;
	public void run(){
		System.out.println(num + "轮子的汽车跑起来啦");
	}
}
public class CarDemo
{//内存分析
	public static void main(String[] args) 
	{
	/*Car c = new Car();
	Car c1 = new Car();
	c.color = "red";
	c1.num = 4;
	System.out.println(c1.color);
	c.run();//不能转移到c1内存中
	
	Car c = new Car();
	Car c1 = c;
	c.color = "red";
	c1.num = 4;
	c1.color = "green";
	System.out.println(c1.color);
	c.run();//可以转移
	*/
	
	Car c = new Car();
	c.color = "red";
	c.num = 4;
	c.run();
	}
}