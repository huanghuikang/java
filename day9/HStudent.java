class Student
{
	String name;
	public Student(String name){
		this.name = name;
	}
	public void study(){
		System.out.println(name + "�ú�ѧϰ");
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
		System.out.println(name + "�ú���Ǯ,Ȼ��ѧ��!");
	}
}
class HStudent 
{
	public static void main(String[] args) 
	{
		Student s = new Student("����");
		s.study();
		MoneyStudent m = new MoneyStudent("�����");
		m.study();
		m.makeMoney();
	}
}
