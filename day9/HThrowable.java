class HThrowable 
{
	public static void main(String[] args) 
	{
		Throwable t = new Throwable("ͷ��,��ð...");
		String info = t.toString();
		String message = t.getMessage();
		System.out.println("toString:" + info);
		System.out.println("message:" + message);

		test();
	}
	public static void test(){
		System.out.println("printStackTrace������ӡ�쳣��ջ��Ϣ");
		Throwable t = new Throwable();
		t.printStackTrace();
	}
}
