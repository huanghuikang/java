import java.util.*;
class SelectSort
{
	public static void main(String[] args) 
	{
		//int[] arr = {12,5,17,8,9};
		int[] arr = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������������");
		for(int i = 0; i < 5; i++){
			arr[i] = scanner.nextInt();
		}
		selectSort(arr);
		bubbleSort(arr);
	}
	//ֱ������
	public static void selectSort(int[] arr){
		for(int j = 0; j < arr.length - 1; j++){
			for(int i = j + 1; i < arr.length; i++){
				if(arr[i] > arr[j]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
			System.out.print("Ŀǰ��Ԫ�أ�");
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + ",\n");
			}
		
	}
	//ð������
	public static void bubbleSort(int[] arr){
		for(int j = 0; j < arr.length - 1; j++){
			for(int i = 0; i < arr.length -1 -j; i++){
				if(arr[i] > arr[i + 1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			System.out.print("Ԫ��Ϊ��");
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + ",\n");
			}
		}
	}
}