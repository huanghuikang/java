class Student
{
	String name;
	static String country = "�й�";
	static{
		System.out.println("��̬�����ִ���ˡ���");
	}
	public Student(String name){
		this.name = name;
	}
	public void study(){
		System.out.println("�ú�ѧϰ" + this);
	}
	public static void sleep(){
		Student s = new Student("����");
		System.out.println(s.name + "������˯����" + "��������" + s.country);
	}
}
class  HStudent
{
	public static void main(String[] args) 
	{
		Student.sleep();
		//Student.study();
	}
}