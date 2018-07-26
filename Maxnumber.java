import java.util.*;
class Maxnumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int result;
		System.out.println("请输入第一个数：");
		int x = scanner.nextInt();
		System.out.println("请输入第二个数：");
		int y = scanner.nextInt();
		if(x > y){
			result = x;
		}else{
			result = y;
		}
		System.out.println("最大数是：" + result);

	}
}
