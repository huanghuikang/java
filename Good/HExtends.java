class Person
{
	String name;
	private int age;
	public Person(String name){
		this.name = name;
	}
	public Person(){
		System.out.println("Person��Ĺ��췽���������ˡ���");
	}
	public void eat(){
		System.out.println(name + "�ڳԷ�����");
	}
}
class Student extends Person
{
	int num;
	public Student(){
		System.out.println("Student��Ĺ��췽���������ˡ���");
	}
	public void study(){
		System.out.println(name + "good good study, day day up");
	}
}
class HExtends 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.name = "����";
		System.out.println("���֣�" + s.name);
		s.eat();
		s.study();
	}
}
