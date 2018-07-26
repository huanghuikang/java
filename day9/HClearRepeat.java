import java.util.*;
class HClearRepeat 
{
	public static void main(String[] args) 
	{
		int[] arr = {11,2,4,2,10,11};
		arr = clearRepeat(arr);
		System.out.println("原数组:");
		System.out.println("清除重复元素的数组:" + Arrays.toString(arr));
	}
	public static int[] clearRepeat(int[] arr){
		int count = 0;
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
					break;
				}
			}
		}
		System.out.println("重复的个数是:" + count);
		int newLength = arr.length - count;
		int[] newArr = new int[newLength];
		int index = 0;
		for(int i = 0; i < arr.length; i++){
			int temp = arr[i];
			boolean flag = false;
			for(int j = 0; j < newArr.length; j++){
				if(temp == newArr[j]){
					flag = true;
					break;
				}
			}
			if(flag == false){
				newArr[index++] = temp;
			}
		}
		return newArr;
	}
}
