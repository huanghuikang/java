import java.util.*;
class Demo 
{
	public static void main(String[] args) 
	{
		//String result = getGrade(90);
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的分数：");
		int num = scanner.nextInt();
		System.out.println("你的分数是：" + num);
		String result = getGrade(num);
		System.out.println("对应的等级是：" + result);
	}
	public static String getGrade(int score){
		String grade = "";
		if(score >= 90 && score <= 100){
			grade = "A等级";
		}else if(score >= 80 && score <= 89){
			grade = "B等级";
		}else if(score >= 70 && score <= 79){
			grade = "C等级";
		}else if(score >= 60 && score <= 69){
			grade = "E等级";
		}else if(score >= 0 && score <= 59){
			grade = "不及格";
		}
		//return grade;
	}
	
}
