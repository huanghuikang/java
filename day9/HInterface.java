interface A
{
	public static final int i = 10;
	public void print();
}
class HInterface implements A
{
	public static void main(String[] args) 
	{
		HInterface h = new HInterface();
		h.print();
	}
	//实现接口中的方法
	public void print(){
		System.out.println("这个是接口中的print方法...");
	}
}
