/*class Person 
//构造方法
{
	String name;
	int age;

	Person(String n, int a){
		name = n;
		age = a;
	}
	public static void main(String[] args) 
	{
		Person p = new Person("张三",14);
		System.out.println("姓名：" + p.name + "\n" + "年龄：" + p.age);
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
		System.out.println("ID号为" + id +",他叫" + name+ ",今年" + age + "岁" +"，哇哇哇……的哭");
	}
}
public class Human
{
	public static void main(String[] args){
		Person person = new Person(2,"李四",6);
		person.cry();
		System.out.println();

	}
}
