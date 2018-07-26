class HThrowable 
{
	public static void main(String[] args) 
	{
		Throwable t = new Throwable("头晕,感冒...");
		String info = t.toString();
		String message = t.getMessage();
		System.out.println("toString:" + info);
		System.out.println("message:" + message);

		test();
	}
	public static void test(){
		System.out.println("printStackTrace用来打印异常的栈信息");
		Throwable t = new Throwable();
		t.printStackTrace();
	}
}
