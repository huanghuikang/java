class HException 
{
	public static void main(String[] args) 
	{
		try{
			int[] arr = null;
			div(4,0,arr);
		}catch(Exception e){
			System.out.println("出现异常了...");
			e.printStackTrace();
		}
		
	}
	/*public static void div(int a, int b,int[] arr){
		int c = 0;
		try{
			c = a/b;
			System.out.println("数组的长度:" + arr.length);
		}catch(ArithmeticException e){
			System.out.println("异常处理了...");
			System.out.println("toString:" + e.toString());
		}catch(NullPointerException e){
			System.out.println("出现了空指针异常...");
		}catch(Exception e){
			System.out.println("我是急诊室,包治百病!");
		}
		System.out.println("c = " + c);
	}*/

	public static void div(int a, int b, int [] arr) throws Exception,NullPointerException{
		if(b == 0){
			throw new Exception();
		}else if(arr == null){
			throw new NullPointerException();
		}
		int c = a/b;
		System.out.println("c = " + c);
	}
}
