import java.security.acl.*;
class  HInterruptedException
{
	public static void main(String[] args) throws InterruptedException
	{
		int[] arr = null;
		div(4,0,arr);
		Object o = new Object();
		o.wait();
	}
	public static void div(int a, int b, int[] arr){
		if(b == 0){
			return;
		}
		int c = a/b;
		System.out.println("c = " + c);
		if(arr != null){
			System.out.println("数组的长度:" + arr.length);
		}
	}
}
