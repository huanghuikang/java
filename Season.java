import java.util.*;
class Season 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入一个月份：");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch(month){
			case 3:
				case 4:
				case 5:
				System.out.println("春天");
			break;
			case 6:
				case 7:
				case 8:
				System.out.println("夏天");
			break;
			case 9:
				case 10:
				case 11:
				System.out.println("秋天");
			break;
			case 12:
				case 1:
				case 2:
				System.out.println("冬天");
			break;
			default:
				System.out.println("没有对应的季节");
			break;
		}
		System.out.println("Hello World!");
	}
}