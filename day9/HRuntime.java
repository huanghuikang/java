abstract class MyRuntime
{
	public final void getTime(){
		long startTime = System.currentTimeMillis();
		code();
		long endTime = System.currentTimeMillis();
		System.out.println("运行时间：" + (endTime-startTime));
	}
	public abstract void code();
}
class HRuntime extends MyRuntime 
{
	public static void main(String[] args) 
	{
		HRuntime h = new HRuntime();
		h.getTime();
	}
	public void code(){
		int i = 0;
		while(i < 100){
			System.out.println("i = " + i);
			i++;
		}
	}
}
