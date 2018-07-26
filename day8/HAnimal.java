// instanceof
class Animal
{
	String name;
	String color;
	public Animal(String name, String color){
		this.name = name;
		this.color = color;
	}
}
class Dog extends Animal
{
	public Dog(String name, String color){
		super(name, color);
	}
	public void bite(){
		System.out.println(name + "咬人！！");
	}
}
class Mouse extends Animal
{
	public Mouse(String name, String color){
		super(name, color);
	}
	public void dig(){
		System.out.println(name + "打洞……");
	}
}
class HAnimal 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog("哈士奇","白色");
		System.out.println("狗是狗类吗？" +(d instanceof Dog));
		System.out.println("狗是动物类吗？" +(d instanceof Animal));
		
		Animal a = new Animal("狗娃","黄色");
		System.out.println("动物都是狗吗？" + (a instanceof Dog));
	}
}
