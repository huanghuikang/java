class Person
{
	String name;
	private int age;
	public Person(String name){
		this.name = name;
	}
	public Person(){
		System.out.println("Person类的构造方法被调用了……");
	}
	public void eat(){
		System.out.println(name + "在吃饭……");
	}
}
class Student extends Person
{
	int num;
	public Student(){
		System.out.println("Student类的构造方法被调用了……");
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
		s.name = "张三";
		System.out.println("名字：" + s.name);
		s.eat();
		s.study();
	}
}
