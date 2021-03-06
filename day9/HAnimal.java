abstract class Animal
{
	String name;
	String color = "动物色";
	public Animal(String name){
		this.name = name;
	}
	public abstract void run();
	public static void eat(){
		System.out.println("动物在吃...");
	}
}
class Mouse extends Animal
{
	String color = "黑色";
	public Mouse(String name){
		super(name);
	}
	public void run(){
		System.out.println("四条腿慢慢的走!");
	}
	public static void eat(){
		System.out.println("老鼠正在偷吃..");
	}
	public void dig(){
		System.out.println("然后去打洞..");
	}
}
class Fish extends Animal
{
	String color = "金黄色";
	public Fish(String name){
		super(name);
	}
	/*public Fish(String color){
		super(color);
	}*/
	public void run(){
		System.out.println(color + "的" + name + "在水中摇摇尾巴欢快地游...");
	}
	public void bubble(){
		System.out.println(name + "吹泡泡...!");
	}
}
class HAnimal 
{
	public static void main(String[] args) 
	{
		Mouse m = new Mouse("老鼠");
		System.out.println(m.color + "的" + m.name);
		m.eat();
		m.dig();
		Fish f = new Fish("鱼");
		f.run();
		//抽象类不能直接创建对象
		/*Animal h =new Animal("猫");
		h.eat();*/
		Animal g = new Mouse("老虎");
		Mouse w = (Mouse)g;
		w.dig();

		Mouse x = new Mouse("米老鼠");
		Fish v = new Fish("草鱼");
		print(x);
		print(v);

	}
	//定义一个函数可以接收任意类型的动物对象,在函数内部要调用到动物特有的方法.
	public static void print(Animal a){
		if(a instanceof Fish){
			Fish v = (Fish)a;
			v.bubble();
		}else if(a instanceof Mouse){
			Mouse x = (Mouse)a;
			x.run();
		}
	}
}
