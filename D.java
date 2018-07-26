import java.util.*;
class D{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("请输入一个分数：");
	int score = scanner.nextInt();
	if(score >= 90 && score <= 100){
		System.out.println("A等级");
	}else if(score >= 80 && score <=89){
		System.out.println("B等级");
	}else if(score >=70 && score <= 79 ){
		System.out.println("C等级");
	}else if(score >=60 && score <=69){
		System.out.println("D等级");
	}
	else if(score >= 0 && score <= 59){
	System.out.println("补考……");
	}
	else{
	System.out.println("输入分数不正确，请重新输入！");
	}
	}
}