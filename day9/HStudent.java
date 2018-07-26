class Student
{
	String name;
	public Student(String name){
		this.name = name;
	}
	public void study(){
		System.out.println(name + "好好学习");
	}
}
interface Money
{
	public void makeMoney();
}
class MoneyStudent extends Student implements Money
{
	public MoneyStudent(String name){
		super(name);
	}
	public void makeMoney(){
		System.out.println(name + "好好挣钱,然后交学费!");
	}
}
class HStudent 
{
	public static void main(String[] args) 
	{
		Student s = new Student("张三");
		s.study();
		MoneyStudent m = new MoneyStudent("孙悟空");
		m.study();
		m.makeMoney();
	}
}
