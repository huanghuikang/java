class Student
{
	String name;
	public Student(String name){
		this.name = name;
	}
	public void study(){
		System.out.println(name + "ѧϰ����˼��������");
	}
}
class BaseStudent extends Student
{
	public BaseStudent(String name){
		super(name);
	}
	public void study(){
		System.out.println(name + "ѧϰjavaSE");
	}
}
class WorkStudent extends Student
{
	public WorkStudent(String name){
		super(name);
	}
	public void study(){
		System.out.println(name + "ѧϰjavaEE + android");
	}
}
class DifferentStudents 
{
	public static void main(String[] args) 
	{
		BaseStudent s = new BaseStudent("�¶���");
		s.study();
		WorkStudent w = new WorkStudent("����");
		w.study();
		Student st = new Student("����");
		st.study();
	}
}