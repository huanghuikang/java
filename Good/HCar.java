class Car
{
	String name;
	String color;
	int wheel;
	public void run(){
		//System.out.println(name + "飞快的跑起来啦……");
		if(wheel >= 4){
			System.out.println(name + wheel + "个轮子飞快跑起来……");
		}else{
			System.out.println(name + "不够4个轮子了，赶快去修理");
		}
	}
}
class CarFactory
{
	String name;
	String address;
	String tel;
	public void repair(Car c){
		if(c.wheel >= 4){
			System.out.println("告诉你，费了很大力气修好了，给钱");
		}else{
			c.wheel = 4;
			System.out.println("修好了，给钱！！");
		}
	}
}
class  HCar
{
	public static void main(String[] args) 
	{
		Car c = new Car();
		c.name = "陆丰";
		c.color = "白色";
		c.wheel = 4;
		
		for(int i = 0; i < 10; i++){
			c.run();
		}
		System.out.println("名字：" + c.name + "," + "颜色：" + c.color + "," + "轮子数：" + c.wheel);
			CarFactory f = new CarFactory();
			f.name = "黄氏修车厂";
			f.address = "广场一楼";
			f.tel = "12345678";
			c.wheel = 3;
			c.run();
			System.out.println(f.name + "是一家很好的汽修厂,在" + f.address + "，电话是："  + f.tel +"\n 为你推荐！");
			f.repair(c);
			c.run();
	}
}
