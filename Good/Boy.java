class Demo
{
	String name;
	int age;
	String gender;
	{//����������ü���
		System.out.println("�ޡ���");
	}
	Demo(){
		System.out.println("�޲ι���");
	}
	Demo(String n, int a , String g){
		name = n;
		age = a;
		gender = g;
		System.out.println("�вι���");
	}
	void run(){
		System.out.println("�ܡ���");
	}
	void Human(){
		System.out.println("���У�" + name + ",���꣺" + age + "�꣬�Ա�" + gender );
	}
}
class Boy 
{
	public static void main(String[] args) 
	{
		
		Demo d = new Demo();
		Demo d2 = new Demo("jack", 1, "��");
		d2.Human();
		System.out.println();
	}
}
