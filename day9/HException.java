class HException 
{
	public static void main(String[] args) 
	{
		try{
			int[] arr = null;
			div(4,0,arr);
		}catch(Exception e){
			System.out.println("�����쳣��...");
			e.printStackTrace();
		}
		
	}
	/*public static void div(int a, int b,int[] arr){
		int c = 0;
		try{
			c = a/b;
			System.out.println("����ĳ���:" + arr.length);
		}catch(ArithmeticException e){
			System.out.println("�쳣������...");
			System.out.println("toString:" + e.toString());
		}catch(NullPointerException e){
			System.out.println("�����˿�ָ���쳣...");
		}catch(Exception e){
			System.out.println("���Ǽ�����,���ΰٲ�!");
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
