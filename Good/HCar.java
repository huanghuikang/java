class Car
{
	String name;
	String color;
	int wheel;
	public void run(){
		//System.out.println(name + "�ɿ��������������");
		if(wheel >= 4){
			System.out.println(name + wheel + "�����ӷɿ�����������");
		}else{
			System.out.println(name + "����4�������ˣ��Ͽ�ȥ����");
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
			System.out.println("�����㣬���˺ܴ������޺��ˣ���Ǯ");
		}else{
			c.wheel = 4;
			System.out.println("�޺��ˣ���Ǯ����");
		}
	}
}
class  HCar
{
	public static void main(String[] args) 
	{
		Car c = new Car();
		c.name = "½��";
		c.color = "��ɫ";
		c.wheel = 4;
		
		for(int i = 0; i < 10; i++){
			c.run();
		}
		System.out.println("���֣�" + c.name + "," + "��ɫ��" + c.color + "," + "��������" + c.wheel);
			CarFactory f = new CarFactory();
			f.name = "�����޳���";
			f.address = "�㳡һ¥";
			f.tel = "12345678";
			c.wheel = 3;
			c.run();
			System.out.println(f.name + "��һ�Һܺõ����޳�,��" + f.address + "���绰�ǣ�"  + f.tel +"\n Ϊ���Ƽ���");
			f.repair(c);
			c.run();
	}
}
