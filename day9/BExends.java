interface A
{
	public void print();
		
}
interface B
{
	public void getArea();
}
interface C extends A,B {
	public void test();

}
class BExends
{
	public static void main(String[] args) 
	{
		BExends h = new BExends();
		h.print();
		h.getArea();
		h.test();
	}
	public void getArea(){
		System.out.println("ʵ�ֽӿ�B����");
	}
	public void test(){
		System.out.println("ʵ�ֽӿ�C����");
	}
	public void print(){
		System.out.println("�����A�ӿڵ�print����..");
	}
}