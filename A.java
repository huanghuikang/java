import java.util.*;
class A{
  public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("请输入您的选择：");
	int option = scanner.nextInt();
	//int option = 13;
	switch(option){
	case 1:
	System.out.println("java");
	break;
	case 2:
	System.out.println("C#");
	break;
	case 3:
	System.out.println("javascript");
	break;
	case 4:
	System.out.println("android");
	break;
	default:
	System.out.println("你的选择有误");
	}
  }
}