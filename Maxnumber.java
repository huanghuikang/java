import java.util.*;
class Maxnumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int result;
		System.out.println("�������һ������");
		int x = scanner.nextInt();
		System.out.println("������ڶ�������");
		int y = scanner.nextInt();
		if(x > y){
			result = x;
		}else{
			result = y;
		}
		System.out.println("������ǣ�" + result);

	}
}
