class Calculator 
{
	public String name = "我的计算器我做主";
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
					System.out.println("除数不能为0！");
				break;
			}
			case '%': {
				System.out.println( name + ":" + num1 + "%" + num2 + "=" + (num1 % num2));
				break;
			}
			default : System.out.println("你在捣乱，我不理你，气死你……");
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
		System.out.println("计算完毕！再来一次……");
		cal.init(90, '/' , 3);
		cal.calculate();
		System.out.println("计算完毕！再来一次……");
		cal.init(258, '+' , 147);
		cal.calculate();
		System.out.println("计算完毕！再来一次……");
		//cal.init(500, '-' , 100);
		cal.calculate();
		System.out.println("计算完毕！再来一次……");
	}
}
