import java.util.*;
class BinarySearch 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,3,1,10,8};
		Arrays.sort(arr);
		String info = Arrays.toString(arr);
		System.out.println("�����Ԫ�أ�" + info);
		int index = Arrays.binarySearch(arr,9);
		System.out.println("�ҵ�������ֵ��" + index);
	}
}