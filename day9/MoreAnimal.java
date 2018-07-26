abstract class Animal
{
	String name;
	String color;
	public Animal(String name,String color){
		this.name = name;
		this.color = color;
	}
	public void eat(){
		System.out.println(name + "����ʳ");
	}
	public abstract void run();
}
class Dog extends Animal
{
	public Dog(String name, String color){
		super(name,color);
	}
	public void run(){
		System.out.println(name + "�������ܵúܿ졭��");
	}
}
class Fish extends Animal
{
	public Fish(String name,String color){
		super(name,color);
	}
	public void run(){
		System.out.println(name + "ҡҡβ���ΰ��Σ�");
	}
}
class  MoreAnimal
{
	public static void main(String[] args) 
	{
		Dog d = new Dog("����Ȯ","��ɫ");
		d.run();
		Fish f = new Fish("����","���ɫ");
		f.run();
		//Animal a = new Animal();  //�����಻�ܽ���ʵ����
	}
}