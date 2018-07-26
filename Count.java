import java.util.*;
class  Count
{
	//键盘输入一串数字
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
   System.out.println("请输入一串整数并在输入时用英文逗号隔开：");
   String inputString=sc.next().toString();
   String stringArray[]=inputString.split(",");
   int num[]=new int[stringArray.length];
   for(int i=0;i<stringArray.length;i++){
    num[i]=Integer.parseInt(stringArray[i]);
    System.out.print(num[i]+" ");
		}
	}
}
