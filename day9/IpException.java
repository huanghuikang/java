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
			throw new NoIpException("û�в����߰�,С��!");
		}
		System.out.println("������ʾ�����б�....");
	}
	public static void main(String[] args) 
	{
		String ip = "192.168.10.100";
		ip = null;
		try{
			feiQ(ip);
		}catch(NoIpException e){
			e.printStackTrace();
			System.out.println("���ϲ�������!");
			System.out.println("\n\n");
		}

		try{
		eat(5);
	}catch(NoMoneyException e){
		e.printStackTrace();
		System.out.println("����ϴ��һ����!!");
	}
	}
	public static void eat(int money) throws NoMoneyException{
		if(money < 10){
			throw new NoMoneyException("�԰�����");
		}
		System.out.println("������������ĵع���ľͰ��!!");
	}
	
}
