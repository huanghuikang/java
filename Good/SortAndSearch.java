import java.util.*;
class SortAndSearch 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入五个数字：");
		for(int i = 0;i < 5;i++){
			arr[i] = scanner.nextInt();
		}
		selectSort(arr);

		
		System.out.println("请输入一个元素：");
		int A = scanner.nextInt();
		int index = halfSearch(arr,A);
		System.out.println("元素所在的索引值是：" + index);
		
	}
	public static void selectSort(int[] arr){
	for(int j = 0;j < arr.length - 1;j++){
			for(int i = j + 1;i < arr.length; i++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("目前的元素：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ",\n");
		}
	}
	public static int halfSearch(int[] arr, int target){
		int max = arr.length - 1;
		int min = 0;
		int mid = (max + min)/2;
		while(true){
			if(target > arr[mid]){
				min = mid + 1;
			}else if(target < arr[mid]){
				max = mid - 1;
			}else{
				return mid;
			}
			if(max < min){
				return - 1;
			}
			mid = (min + max)/2;
		}
	}
}

