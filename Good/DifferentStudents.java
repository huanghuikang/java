class Student
{
	String name;
	public Student(String name){
		this.name = name;
	}
	public void study(){
		System.out.println(name + "学习马克思列宁主义");
	}
}
class BaseStudent extends Student
{
	public BaseStudent(String name){
		super(name);
	}
	public void study(){
		System.out.println(name + "学习javaSE");
	}
}
class WorkStudent extends Student
{
	public WorkStudent(String name){
		super(name);
	}
	public void study(){
		System.out.println(name + "学习javaEE + android");
	}
}
class DifferentStudents 
{
	public static void main(String[] args) 
	{
		BaseStudent s = new BaseStudent("陈东东");
		s.study();
		WorkStudent w = new WorkStudent("张三");
		w.study();
		Student st = new Student("李四");
		st.study();
	}
}
