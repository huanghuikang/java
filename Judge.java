import java.util.*;
class Judge{
  public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("�������������䣺");
	int age = scanner.nextInt();
	String result = age > 18 ? "������" : "ĩ������";
	System.out.println(result);
  }
}