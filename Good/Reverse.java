import java.util.*;
class Reverse 
{
	public static void main(String[] args) 
	{
		//char[] arr = {'a','b','c','d','e'};
		char[] arr = new char[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ϲ������ĸ��");
		//for(int i = 0; i < arr.length; i++){
		//	arr[i] = scanner.next();
		//}
		String str = scanner.next();
		for(int i = 0; i < arr.length; i++){
			arr[i] = str.charAt(0);
		}
		
		reverse(arr);
	}
	public static void reverse(char[] arr){
		for(int startIndex = 0, endIndex = arr.length - 1;
		startIndex < endIndex; 
		startIndex++,endIndex--){
			char temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
		System.out.print("Ŀǰ��Ԫ��Ϊ��");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ",");
		}
	}
}