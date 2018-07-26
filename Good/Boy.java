class Demo
{
	String name;
	int age;
	String gender;
	{//几个对象调用几次
		System.out.println("哭……");
	}
	Demo(){
		System.out.println("无参构造");
	}
	Demo(String n, int a , String g){
		name = n;
		age = a;
		gender = g;
		System.out.println("有参构造");
	}
	void run(){
		System.out.println("跑……");
	}
	void Human(){
		System.out.println("他叫：" + name + ",今年：" + age + "岁，性别：" + gender );
	}
}
class Boy 
{
	public static void main(String[] args) 
	{
		
		Demo d = new Demo();
		Demo d2 = new Demo("jack", 1, "男");
		d2.Human();
		System.out.println();
	}
}
