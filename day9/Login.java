import java.util.*;
class User
{
	String userName;
	String password;
}
class Login 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		User[] users = new User[10];
		while(true){
			System.out.println("��ѡ����: A(ע��) B(�鿴�û�)");
			String option = scanner.next();
			if(option.equals("A")){
				System.out.println("�������û���:");
				String UserName = scanner.next();
			}else{
				System.out.println("����������:");
				String password = scanner.next();
			}
		}
	}
}