interface Dao
{

	public void add();
	public void delete();
}
class UserDao implements Dao
{
	public void add(){
		System.out.println("���Ա���ɹ�!!");
	}
	public void delete(){
		System.out.println("ɾ��Ա���ɹ�!!");
	}
}
class Outer
{
	int x = 100;
	static class Inner
	{
		static int i = 10;
		public void print(){
			System.out.println("����ǳ�Ա�ڲ���ķ���!" + i);
		}
	}
	public void instance(){
		Inner inner = new Inner();
		inner.print();
	}
}
class  Worker
{
	public static void main(String[] args) 
	{
		Dao d = new UserDao();
		d.add();
		d.delete();

		System.out.println(Outer.Inner.i);
		Outer outer = new Outer();
		outer.instance();
		
		Outer.Inner inner = new Outer. Inner();
		inner.print();
	}
}
