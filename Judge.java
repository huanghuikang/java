import java.util.*;
class Judge{
  public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("请输入您的年龄：");
	int age = scanner.nextInt();
	String result = age > 18 ? "成年人" : "末成年人";
	System.out.println(result);
  }
}