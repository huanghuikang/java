
/*class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		Employee jack = new Employee();
		jack.name = "jack";
		jack.id = "123456";
		jack.gender = "��";
		jack.work();
		System.out.println();
		jack.gender = "��������";
		jack.work();
	}
}
class Employee
{
	String name;
	String id;
	String gender;
	public void work(){
		System.out.println(id + ":" + name + ":" + gender + "Ŭ�������У�����");
	}
}*/

//��װ��ʵ��
/*class  EmployeeDemo
{
	public static void main(String[] args) 
	{
		//����ģ�private�����Ժ��޷�������ʹ�ã�ֻ��ͨ���������������
		Employee jack = new Employee();
		jack.name = "jack";
		jack.id = "123456";
		jack.gender = "��";

		jack.gender = "��������";
		jack.work();
	}
}
class Emplayee
{
	//��private����
	private String name;
	private String id;
	private String gender;
	public void work(){
		System.out.println(id + ":" + name + ":" + gender + "Ŭ�������У�����");
	}
}*/

public class EmployeeDemo
{
	public static void main(String[] args) 
	{
		Employee jack = new Employee();
		jack.setId("007");
		jack.setName("jack");
		jack.setGender("��XX");
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
		if("��".equals(gen) || "Ů".equals(gen)){
			gender = gen;
		}else {
			System.out.println("������\"��\"����\"Ů\"");
		}
	}

	public void work(){
		System.out.println(id + ":" + name + ":" + gender + "Ŭ�������У�����");
	}
}
