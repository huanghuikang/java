/*class Person 
//���췽��
{
	String name;
	int age;

	Person(String n, int a){
		name = n;
		age = a;
	}
	public static void main(String[] args) 
	{
		Person p = new Person("����",14);
		System.out.println("������" + p.name + "\n" + "���䣺" + p.age);
	}
}*/


class Person
{
	private int id;
	private String name;
	private int age;
	public Person(){
		cry();
	}
	public Person(int id,String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void cry(){
		System.out.println("ID��Ϊ" + id +",����" + name+ ",����" + age +"�������ۡ����Ŀ�");
	}
}
public class Human
{
	public static void main(String[] args){
		Person person = new Person(2,"����",6);
		person.cry();
		System.out.println();

	}
}