/*
����ʵ����������������֮���Ǵ��ڹ�ϵ
	��Ա���������	�����벿�ֹ�ϵ		has a ��ϵ
	ѧ�������� ��	�̳еĹ�ϵ			is a ��ϵ
*/
class Player
{
	int num;
	String name;
	public Player(int num, String name){
		this.num = num;
		this.name = name;
	}
	public void run(){
		System.out.println(name + "���ܡ���");
	}
}
class Team
{
	String name;
	Player p1;
	Player p2;
	Player p3;
	public Team(String name,Player p1,Player p2,Player p3){
		this.name = name;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	public void startGame(){
		System.out.println(name + "����������");
	}
}
class  HTeam
{
	public static void main(String[] args) 
	{
		Player p1 = new Player(12,"÷��");
		Player p2 = new Player(7,"C��");
		Player p3 = new Player(11,"�����");
		Team t = new Team("���",p1,p2,p3);
		t.startGame();
		System.out.println("���֣�" + t.p2.name);
		Player p = new Player(2,"�й�");
		p.run();
		System.out.println("����" + p.name + p.num);
	}
}
