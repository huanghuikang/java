//���ú����Ĺ��췽���ǿ��Գ�ʼ�������̳���ȥ�����Եġ�
class Fu
{
	int x = 10;
	String name;
	public Fu(){
		System.out.println("Fu���޲εĹ��췽������");
	}
	public Fu(String name){
		this.name = name;
		System.out.println("Fu��d���εĹ��췽������");
	}
	
	public void eat(){
		System.out.println("Сͷ�ְֳԷ�������");
	}
}
class Zi extends Fu
{
	int x = 20;
	int num;
	public Zi(String name,int num){
		super(name);		//ָ�����ø���һ�������Ĺ��캯��
		//this();				//���ñ����޲ι��췽��
		//super�ؼ��ֵ��ø���Ĺ��캯��ʱ����������Ҫ�����๹�캯���еĵ�һ����䡣
		System.out.println("Zi����εĹ��췽������");
	}
	public Zi(){
		System.out.println("Zi���޲εĹ��췽������");
	}
	public void print(){
		System.out.println("x = " + super.x);
	}
	public void eat(){
		System.out.println("��ͷ���ӳ���Ϻ����");
	}
}
class H1Extends 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi("����",12);
		Zi j = new Zi("��ͷ����",20);
		System.out.println("name = " + j.name);
	}
}