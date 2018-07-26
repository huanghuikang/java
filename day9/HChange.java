import java.util.*;
class Person
{
	int x = 10;
}
class  HChange
{
	/*public static void main(String[] args) 
	{
		Person p = new Person();
		changeObj(p,20);
		System.out.println("x = " + p.x);
	}
	public static void changeObj(Person p, int x){
		p.x = x;
	}*/


	public static void changeValue(int a, int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println("方法内部交换前的值：a =" + a + "\tb =" + b);
	}
	public static void changeArr(int[] arr, int index1, int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	public static void main(String[] args)
	{
		int a = 3;
		int b = 5;
		changeValue(a,b);
		System.out.println("交换后的值：a = " + a + "\tb = " + b);
		int[] arr = { 23, 10, 9 };
		changeArr(arr,1,2);
		System.out.println("数的元素：" + Arrays.toString(arr));
	}
	
}
