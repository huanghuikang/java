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
		System.out.println("实现接口B方法");
	}
	public void test(){
		System.out.println("实现接口C方法");
	}
	public void print(){
		System.out.println("这个是A接口的print方法..");
	}
}
