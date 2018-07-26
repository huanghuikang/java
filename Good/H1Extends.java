//调用含糊的构造方法是可以初始化含糊继承下去的属性的。
class Fu
{
	int x = 10;
	String name;
	public Fu(){
		System.out.println("Fu类无参的构造方法……");
	}
	public Fu(String name){
		this.name = name;
		System.out.println("Fu类d带参的构造方法……");
	}
	
	public void eat(){
		System.out.println("小头爸爸吃番薯……");
	}
}
class Zi extends Fu
{
	int x = 20;
	int num;
	public Zi(String name,int num){
		super(name);		//指定调用父类一个参数的构造函数
		//this();				//调用本类无参构造方法
		//super关键字调用父类的构造函数时，该语句必须要是子类构造函数中的第一个语句。
		System.out.println("Zi类带参的构造方法……");
	}
	public Zi(){
		System.out.println("Zi类无参的构造方法……");
	}
	public void print(){
		System.out.println("x = " + super.x);
	}
	public void eat(){
		System.out.println("大头儿子吃龙虾……");
	}
}
class H1Extends 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi("狗娃",12);
		Zi j = new Zi("大头儿子",20);
		System.out.println("name = " + j.name);
	}
}
