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
			System.out.println("���˳���Ϊ���쳣..");
			throw e;
		}finally{
			System.out.println("finall��Ĵ���ִ����.....");
		}
	}
}
