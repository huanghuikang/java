import java.util.*;
class D{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("������һ��������");
	int score = scanner.nextInt();
	if(score >= 90 && score <= 100){
		System.out.println("A�ȼ�");
	}else if(score >= 80 && score <=89){
		System.out.println("B�ȼ�");
	}else if(score >=70 && score <= 79 ){
		System.out.println("C�ȼ�");
	}else if(score >=60 && score <=69){
		System.out.println("D�ȼ�");
	}
	else if(score >= 0 && score <= 59){
	System.out.println("��������");
	}
	else{
	System.out.println("�����������ȷ�����������룡");
	}
	}
}