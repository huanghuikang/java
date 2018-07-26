import java.io.*;
class OpenFinally 
{
	public static void main(String[] args) 
	{
		FileReader fileReader = null;
		try{
			File file = new File("D:\\A.txt");
			fileReader = new FileReader(file);
			char[] buf = new char[1024];
			int length = 0;
			length = fileReader.read(buf);
			System.out.println("读取到的内容:" + new String(buf,0,length));
		}catch(IOException e){
			System.out.println("读取资源文件失败....");
		}finally{
			try{
				fileReader.close();
				System.out.println("释放资源文件成功...");
			}catch(IOException e){
				System.out.println("释放资源文件失败....");
			}
		}
	}
}
