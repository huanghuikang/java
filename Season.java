import java.util.*;
class Season 
{
	public static void main(String[] args) 
	{
		System.out.println("������һ���·ݣ�");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch(month){
			case 3:
				case 4:
				case 5:
				System.out.println("����");
			break;
			case 6:
				case 7:
				case 8:
				System.out.println("����");
			break;
			case 9:
				case 10:
				case 11:
				System.out.println("����");
			break;
			case 12:
				case 1:
				case 2:
				System.out.println("����");
			break;
			default:
				System.out.println("û�ж�Ӧ�ļ���");
			break;
		}
		System.out.println("Hello World!");
	}
}