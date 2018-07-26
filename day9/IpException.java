class NoIpException extends Exception
{
	public NoIpException(String message){
		super(message);
	}
}
class NoMoneyException extends Exception
{
	public NoMoneyException(String message){
		super(message);
	}
}
class  IpException
{
	public static void feiQ(String ip) throws NoIpException{
		if(ip == null){
			throw new NoIpException("没有插网线啊,小白!");
		}
		System.out.println("正常显示好友列表....");
	}
	public static void main(String[] args) 
	{
		String ip = "192.168.10.100";
		ip = null;
		try{
			feiQ(ip);
		}catch(NoIpException e){
			e.printStackTrace();
			System.out.println("马上插上网线!");
			System.out.println("\n\n");
		}

		try{
		eat(5);
	}catch(NoMoneyException e){
		e.printStackTrace();
		System.out.println("跟我洗碗一个月!!");
	}
	}
	public static void eat(int money) throws NoMoneyException{
		if(money < 10){
			throw new NoMoneyException("吃霸王餐");
		}
		System.out.println("吃上了香喷喷的地沟油木桶饭!!");
	}
	
}
