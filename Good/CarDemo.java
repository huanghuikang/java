class  Car
{
	int num;
	String color;
	public void run(){
		System.out.println(num + "���ӵ�������������");
	}
}
public class CarDemo
{//�ڴ����
	public static void main(String[] args) 
	{
	/*Car c = new Car();
	Car c1 = new Car();
	c.color = "red";
	c1.num = 4;
	System.out.println(c1.color);
	c.run();//����ת�Ƶ�c1�ڴ���
	
	Car c = new Car();
	Car c1 = c;
	c.color = "red";
	c1.num = 4;
	c1.color = "green";
	System.out.println(c1.color);
	c.run();//����ת��
	*/
	
	Car c = new Car();
	c.color = "red";
	c.num = 4;
	c.run();
	}
}