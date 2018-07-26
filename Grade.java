import java.util.*;
class Grade 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一串整数并在输入时用英文逗号隔开：");
		String inputString = scanner.next().toString();
		String stringArray[] = inputString.split(",");
		int num[] = new int[stringArray.length];
		
		//int[] arr = {12,5,17,8,9};
		selectSort(arr);
	}
	public static void selectSort(int[] arr){
		for(int j = 0; j < arr.length - 1; j++){
			for(int i = j + 1;i < arr.length;i++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		System.out.print("目前的元素：");
			for(int i = 0;i < arr.length; i++){
				System.out.print (arr[i] + ",");
			}
	}
}
