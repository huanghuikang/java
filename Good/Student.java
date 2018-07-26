class Demo
{
	String name;
	String sex;
	int age;
	Demo(){
		System.out.println("无参构造");
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
		System.out.println("姓名：" + name + "性别：" + sex + "年龄：" + age + "哈哈！！！");
	}
	void run(){
		System.out.println("run.....");
	}
}
class Student 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo("Jum","男",20);
		System.out.println(d);
		Demo d2 = new Demo("Rose","女",18);
		System.out.println(d2);
		d2.speak();
	}
}
