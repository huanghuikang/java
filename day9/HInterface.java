interface A
{
	public static final int i = 10;
	public void print();
}
class HInterface implements A
{
	public static void main(String[] args) 
	{
		HInterface h = new HInterface();
		h.print();
	}
	//ʵ�ֽӿ��еķ���
	public void print(){
		System.out.println("����ǽӿ��е�print����...");
	}
}