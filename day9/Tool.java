class Pencil
{
	String name;
	public Pencil(String name){
		this.name = name;
	}
	public void write(){
		System.out.println(name + "ɳɳ��д..");
	}
}
interface Eraser
{
	public void remove();
}
class PencilWithEraser extends Pencil implements Eraser
{
	public PencilWithEraser(String name){
		super(name);
	}
	public void remove(){
		System.out.println("Ϳ��,Ϳ��....");
	}
}
class Tool 
{
	public static void main(String[] args) 
	{
		PencilWithEraser h = new PencilWithEraser("2BǦ��");
		h.write();
		h.remove();
	}
}
