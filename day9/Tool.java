class Pencil
{
	String name;
	public Pencil(String name){
		this.name = name;
	}
	public void write(){
		System.out.println(name + "É³É³µÄÐ´..");
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
		System.out.println("Í¿¸Ä,Í¿¸Ä....");
	}
}
class Tool 
{
	public static void main(String[] args) 
	{
		PencilWithEraser h = new PencilWithEraser("2BÇ¦±Ê");
		h.write();
		h.remove();
	}
}
