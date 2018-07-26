
/*class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		Employee jack = new Employee();
		jack.name = "jack";
		jack.id = "123456";
		jack.gender = "男";
		jack.work();
		System.out.println();
		jack.gender = "不是男人";
		jack.work();
	}
}
class Employee
{
	String name;
	String id;
	String gender;
	public void work(){
		System.out.println(id + ":" + name + ":" + gender + "努力工作中！！！");
	}
}*/

//封装的实现
/*class  EmployeeDemo
{
	public static void main(String[] args) 
	{
		//错误的，private修饰以后无法被类外使用，只有通过方法被类外调用
		Employee jack = new Employee();
		jack.name = "jack";
		jack.id = "123456";
		jack.gender = "男";

		jack.gender = "不是男人";
		jack.work();
	}
}
class Emplayee
{
	//用private修饰
	private String name;
	private String id;
	private String gender;
	public void work(){
		System.out.println(id + ":" + name + ":" + gender + "努力工作中！！！");
	}
}*/

public class EmployeeDemo
{
	public static void main(String[] args) 
	{
		Employee jack = new Employee();
		jack.setId("007");
		jack.setName("jack");
		jack.setGender("男XX");
		System.out.println(jack.getGender());
		System.out.println(jack.getId());
		System.out.println(jack.getName());
		jack.work();
	}
}
class Employee
{
	private String name;
	private String id;
	private String gender;

	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	public String getId(){
		return id;
	}
	public void setId(String i){
		id = i;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String gen){
		if("男".equals(gen) || "女".equals(gen)){
			gender = gen;
		}else {
			System.out.println("请输入\"男\"或者\"女\"");
		}
	}

	public void work(){
		System.out.println(id + ":" + name + ":" + gender + "努力工作中！！！");
	}
}
