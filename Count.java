import java.util.*;
class  Count
{
	//��������һ������
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
   System.out.println("������һ��������������ʱ��Ӣ�Ķ��Ÿ�����");
   String inputString=sc.next().toString();
   String stringArray[]=inputString.split(",");
   int num[]=new int[stringArray.length];
   for(int i=0;i<stringArray.length;i++){
    num[i]=Integer.parseInt(stringArray[i]);
    System.out.print(num[i]+" ");
		}
	}
}
