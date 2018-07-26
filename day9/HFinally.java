class HFinally 
{
	public static void main(String[] args) 
	{
		div(4,0);
	}
	public static void div(int a, int b){
		try{
			if(b == 5){
				System.exit(0);
			}
			int c = a/b;
			System.out.println("c = " + c);
		}catch(Exception e){
			System.out.println("出了除数为的异常..");
			throw e;
		}finally{
			System.out.println("finall块的代码执行了.....");
		}
	}
}
