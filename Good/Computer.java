class Calculator 
{
	public String name = "�ҵļ�����������";
	public double num1;
	public double num2;
	public char option;
	public void init(double a,char op,double b){
		num1 = a;
		option = op;
		num2 = b;
	}
	public void calculate(){
		switch(option)
		{
			case '+': System.out.println( name + ":" + num1 + "+" + num2 + "=" + (num1 + num2));
			break;
			case '-': System.out.println( name + ":" + num1 + "-" + num2 + "=" + (num1 - num2));
			break;
			case '*': System.out.println( name + ":" + num1 + "*" + num2 + "=" + (num1 * num2));
			break;
			case '/':{
				if(num2 != 0)
					System.out.println( name + ":" + num1 + "/" + num2 + "=" + (num1 / num2));
				else
					System.out.println("��������Ϊ0��");
				break;
			}
			case '%': {
				System.out.println( name + ":" + num1 + "%" + num2 + "=" + (num1 % num2));
				break;
			}
			default : System.out.println("���ڵ��ң��Ҳ����㣬�����㡭��");
		}
	}
}
class Computer
{
	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		cal.init( 40, '%' , 20);
		cal.calculate();
		System.out.println("������ϣ�����һ�Ρ���");
		cal.init(90, '/' , 3);
		cal.calculate();
		System.out.println("������ϣ�����һ�Ρ���");
		cal.init(258, '+' , 147);
		cal.calculate();
		System.out.println("������ϣ�����һ�Ρ���");
		//cal.init(500, '-' , 100);
		cal.calculate();
		System.out.println("������ϣ�����һ�Ρ���");
	}
}
