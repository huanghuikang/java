abstract class Animal
{
	String name;
	String color = "����ɫ";
	public Animal(String name){
		this.name = name;
	}
	public abstract void run();
	public static void eat(){
		System.out.println("�����ڳ�...");
	}
}
class Mouse extends Animal
{
	String color = "��ɫ";
	public Mouse(String name){
		super(name);
	}
	public void run(){
		System.out.println("��������������!");
	}
	public static void eat(){
		System.out.println("��������͵��..");
	}
	public void dig(){
		System.out.println("Ȼ��ȥ��..");
	}
}
class Fish extends Animal
{
	String color = "���ɫ";
	public Fish(String name){
		super(name);
	}
	/*public Fish(String color){
		super(color);
	}*/
	public void run(){
		System.out.println(color + "��" + name + "��ˮ��ҡҡβ�ͻ������...");
	}
	public void bubble(){
		System.out.println(name + "������...!");
	}
}
class HAnimal 
{
	public static void main(String[] args) 
	{
		Mouse m = new Mouse("����");
		System.out.println(m.color + "��" + m.name);
		m.eat();
		m.dig();
		Fish f = new Fish("��");
		f.run();
		//�����಻��ֱ�Ӵ�������
		/*Animal h =new Animal("è");
		h.eat();*/
		Animal g = new Mouse("�ϻ�");
		Mouse w = (Mouse)g;
		w.dig();

		Mouse x = new Mouse("������");
		Fish v = new Fish("����");
		print(x);
		print(v);

	}
	//����һ���������Խ����������͵Ķ������,�ں����ڲ�Ҫ���õ��������еķ���.
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