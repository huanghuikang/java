class Demo
{
	String name;
	String sex;
	int age;
	Demo(){
		System.out.println("�޲ι���");
	}
	Demo(String name){
	this();
	this.name = name;
	}
	Demo(String name, String sex, int age){
	this(name);
	System.out.println(this);
	this.sex = sex;
	this.age = age;
}
	void speak(){
		run();
		System.out.println("������" + name + "�Ա�" + sex + "���䣺" + age + "����������");
	}
	void run(){
		System.out.println("run.....");
	}
}
class Student 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo("Jum","��",20);
		System.out.println(d);
		Demo d2 = new Demo("Rose","Ů",18);
		System.out.println(d2);
		d2.speak();
	}
}
