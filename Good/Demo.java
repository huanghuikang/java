import java.util.*;
class Demo 
{
	public static void main(String[] args) 
	{
		//String result = getGrade(90);
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ķ�����");
		int num = scanner.nextInt();
		System.out.println("��ķ����ǣ�" + num);
		String result = getGrade(num);
		System.out.println("��Ӧ�ĵȼ��ǣ�" + result);
	}
	public static String getGrade(int score){
		String grade = "";
		if(score >= 90 && score <= 100){
			grade = "A�ȼ�";
		}else if(score >= 80 && score <= 89){
			grade = "B�ȼ�";
		}else if(score >= 70 && score <= 79){
			grade = "C�ȼ�";
		}else if(score >= 60 && score <= 69){
			grade = "E�ȼ�";
		}else if(score >= 0 && score <= 59){
			grade = "������";
		}
		//return grade;
	}
	
}