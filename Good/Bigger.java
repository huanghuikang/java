import java.util.*;
class Bigger 
{
	public static void main(String[] args) 
	{
		//int[] arr = {-12,14,15,-26,4};
		int[] arr = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入五个数字：");
		for(int i = 0; i < 5; i++){
			arr[i] = scanner.nextInt();
		}

		int max = getMax(arr);
		System.out.println("最大值：" + max);
		int min = getMin(arr);
		System.out.println("最小值：" + min);
	}
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	public static int getMin(int[] arr){
		int min = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
}
