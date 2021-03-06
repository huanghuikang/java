import java.util.*;
class HalfSearch 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,16,19,23,54};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int A = scanner.nextInt();
		int index = halfSearch(arr,A);
		System.out.println("元素所在的索引值是：" + index);
	}
	public static int halfSearch(int[] arr, int target){
		int max = arr.length - 1;
		int min = 0;
		int mid = (max + min) / 2;
		while(true){
			if(target > arr[mid]){
				min = mid + 1;
			}else if(target < arr[mid]){
				max = mid -1;
			}else{
				return mid;
			}
			if(max < min){
				return -1;
			}
			mid = (min + max)/2;
		}
	}
	public static int searchEle(int[] arr, int target){
		for(int i = 0;i < arr.length; i++){
			if(arr[i] == target){
				return i;
			}
		}
		return -1;
	}
}
